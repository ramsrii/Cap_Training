package com.Flight.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcConFlight {
		
			public static void main(String[] args) {
				JdbcConFlight obj=new JdbcConFlight();
				Connection con=obj.getConnection();
			}
			public Connection getConnection()
			{
				try 
				{
					Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1","postgres","Narayanan.s");
					if(con!=null)
					{
						System.out.println("Connected to dataBase........");
						return con;
					}
					else
					{
						System.out.println("Failed to connect........");
					}
				}
				catch(SQLException e)
				{
					System.err.format("SQL State: %s\n%s",e.getSQLState(),e.getMessage());
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				return null;
			}

		}




