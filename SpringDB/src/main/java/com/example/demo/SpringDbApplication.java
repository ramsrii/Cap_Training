package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDbApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringDbApplication.class, args);
		ApplicationContext context=new ClassPathXmlApplicationContext("products.xml");
		ProductDAO dao=(ProductDAO)context.getBean("pdao");
		Product p=(Product) context.getBean("Product");
		Product p1=dao.getProduct(101);
		System.out.println(p1);
		
	}

}
