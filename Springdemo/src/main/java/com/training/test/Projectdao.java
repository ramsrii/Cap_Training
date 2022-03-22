package com.training.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;

public class Projectdao {
	@Autowired
	DBUtil obj1;
	
	public void getConnection() throws SQLException
	{
		
		System.setProperty("Jdbc.drivers","org.postgresql.Driver");
		Properties properties=new Properties();
		properties.put("user","postgres");
		properties.put("password","Narayanan.s");
		String url="jdbc:postgresql://localhost:5432/test1";
		Connection con= DriverManager.getConnection(url,properties);
		System.out.println("Connection establised: "+con);
		
		
		
	}

}
