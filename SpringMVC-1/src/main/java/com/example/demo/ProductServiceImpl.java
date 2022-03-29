package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;
	
	@Override
	public Product saveProduct(Product p)
	{
		return null;
	}
	
	@Override
	public List<Product> fetchProductList()
	{
		List<Product> list=repo.findAll();
		return list;
	}
	
	@Override
	public Product updateProduct(Product p,int pid)
	{
		return null;
	}
	
	@Override
	public void deleteProductById(int pid)
	{
		
	}

}
