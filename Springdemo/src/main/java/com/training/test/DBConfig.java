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
	public DBUtil DBdao()
	{
		System.out.println("Connected");
		DBUtil dbdao = new DBUtil();
		dbdao.setDrivername("test1");
		dbdao.setUsernmae("postgres");
		dbdao.setPassword("Narayanan.s");
		dbdao.setUrl("jdbc:postgresql://localhost:5432/test1");
		return dbdao;
	}
}