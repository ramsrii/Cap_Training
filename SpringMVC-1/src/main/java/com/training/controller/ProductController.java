package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET )
	public String test(@PathVariable("id")int id, Model model) {
		
		Product p = service.findById(id);
		model.addAttribute("result",p);
		System.out.println(p);
		String result = p.toString();
		return result;
	}
	
	@RequestMapping("/getproduct/{id}")
	public ResponseEntity<Product> findOne(@PathVariable(value="id") Integer id)
	{
		Product prod=service.findById(id);
		if(prod!=null)
		{
			return new ResponseEntity<>(prod,HttpStatus.OK);
			
		}
		else
		{
			return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/save")
	public ResponseEntity<Product> saveEmp(@RequestBody Product p)
	{
		Product prod=p;
		service.saveProduct(p);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}@PutMapping("/update")
	public ResponseEntity<Product> update(@RequestBody Product p)
	{
		Product prod=p;
		service.updateProduct(p,p.getPid());
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Product> delete(@PathVariable(value="id") Integer id)
	{
		Product prod=service.deleteById(id);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}

	
	
}
