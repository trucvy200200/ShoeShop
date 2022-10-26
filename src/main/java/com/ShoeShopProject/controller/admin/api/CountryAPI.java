package com.ShoeShopProject.controller.admin.api;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ShoeShopProject.utils.HttpUtils;

import jdk.nashorn.internal.ir.RuntimeNode.Request;
@WebServlet(urlPatterns={"/api-admin-country"})
public class CountryAPI extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException 
	{	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		HttpUtils.of(request.getReader());
	}
	
	protected void doPut(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException 
	{	
		
	}
	
	protected void doDelete(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException 
	{	
		
	}
}
