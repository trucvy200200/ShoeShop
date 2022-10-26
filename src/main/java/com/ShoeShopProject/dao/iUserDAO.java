package com.ShoeShopProject.dao;

import java.util.List;

import com.ShoeShopProject.model.UserModel;

public interface iUserDAO extends GenericDAO<UserModel>{
	List<UserModel> findUserByPass(String user, String pass);
}
