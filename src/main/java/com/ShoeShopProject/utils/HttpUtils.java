package com.ShoeShopProject.utils;

import java.io.BufferedReader;
import java.io.IOException;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class HttpUtils {
	private String value;
	public HttpUtils(String value)
	{
		this.value=value;
		
	}
	public <T> T toModel(Class<T>tClass) {
		
	}
	public static HttpUtils of(BufferedReader reader) {
		StringBuilder sb = new StringBuilder();
		try {
			String line;
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
				System.out.print(e.getMessage());
		}
		return new HttpUtils(sb.toString());
	}
}
