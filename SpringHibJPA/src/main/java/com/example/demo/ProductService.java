package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductService {
	Product saveProduct(Product p);
	
	
	List<Product> fetchProductList();
	
	Product updateProduct(Product p,int pid);
	
	void deleteProductById(int pid);
	

}
