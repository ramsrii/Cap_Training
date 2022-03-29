package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product;
import com.example.demo.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/products")
	public String test()
	{
		return "Test Product Controller";
	}
	@RequestMapping("/getProducts")
	List<Product> listProducts()
	{
		List<Product> prodlist=service.fetchProductList();
		for(Product p:prodlist)
			System.out.println(p+"\n");
		
		return prodlist;
		
	}
	

}
