package com.training.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DBConfig {
	@Bean
	public Empdao empdao()
	{
		Empdao empdao = new Empdao();
		return empdao;
	}
	@Bean
	public DBdao DBdao()
	{
		System.out.println("Connected");
		DBdao dbdao = new DBdao();
		dbdao.setDrivername("test1");
		dbdao.setUsernmae("postgres");
		dbdao.setPassword("Narayanan.s");
		dbdao.setUrl("jdbc:postgresql://localhost:5432/test1");
		return dbdao;
	}
}