package com.ShoeShopProject.dao.impl;

import java.util.List;

import com.ShoeShopProject.dao.iUserDAO;
import com.ShoeShopProject.mapper.UserMapper;
import com.ShoeShopProject.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements iUserDAO {

	@Override
	public List<UserModel> findUserByPass(String user, String pass) {
		String sql="Select * from users where (email=? and password=?) or (phone=? and password=?)";
		return query(sql, new UserMapper(), user, pass, user, pass);
	}

}
