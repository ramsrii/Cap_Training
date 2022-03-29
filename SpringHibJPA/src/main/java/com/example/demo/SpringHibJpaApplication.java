package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableJpaRepositories(basePackages="com.example.demo")
@EnableTransactionManagement
@EntityScan(basePackages="com.example.demo")


public class SpringHibJpaApplication implements CommandLineRunner{
	
	@Autowired
	ProductService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringHibJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception
	{
		List<Product> list=service.fetchProductList();
		System.out.println(list);
		
	}

}
