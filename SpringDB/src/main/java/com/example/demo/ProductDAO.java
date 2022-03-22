package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDAO {
	@Autowired
	JdbcTemplate jdbctemplate;
	String SQL_SELECT="select * from Product";
	
void addProduct(Product p)
{

}
void getProducts()
{
	jdbctemplate.execute(SQL_SELECT);
}

}
