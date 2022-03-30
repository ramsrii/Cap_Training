package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	void saveProduct(Product p);
	
	
	List<Product> fetchProductList();
	
	Product updateProduct(Product p,int pid);
	
	
	Product findById(int id);


	Product deleteById(int id);

	

}
