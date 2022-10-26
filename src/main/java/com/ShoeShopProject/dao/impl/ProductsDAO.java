package com.ShoeShopProject.dao.impl;

import java.util.List;

import com.ShoeShopProject.dao.iProductsDAO;
import com.ShoeShopProject.mapper.ProductsMapper;
import com.ShoeShopProject.model.ProductsModel;

public class ProductsDAO extends AbstractDAO<ProductsModel> implements iProductsDAO {

	@Override
	public List<ProductsModel> findProductById(Integer id) {
		String sql = "Select * from products where idProducts =?";
		return query(sql,new ProductsMapper(), id);	
	}
}
