package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;
	
	@Override
	public void saveProduct(Product p)
	{
		repo.save(p);
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
		repo.save(p);
		return p;
		
	}
	

	@Override
	public Product findById(int id) {
		Product p = repo.getById(id);
		return p;
	}
	
	@Override
	public Product deleteById(int id) {
		Product p = repo.getById(id);
		repo.deleteById(id);
		return p;
	}
	
	

}
