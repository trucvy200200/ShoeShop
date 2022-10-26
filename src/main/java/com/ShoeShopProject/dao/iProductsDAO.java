package com.ShoeShopProject.dao;

import java.util.List;

import com.ShoeShopProject.model.ProductsModel;

public interface iProductsDAO extends GenericDAO<ProductsModel>{
	List<ProductsModel> findProductById(Integer id); 
}
