package com.course1.dao;
import java.sql.*;
import java.util.*;

import com.Student1.dao.*;
import com.Student1.model.Student1;
import com.course1.model.*;

public class course1DAO {
	Connection con;
	public void getDbConnection()
	{
		JdbcCon dbcon=new JdbcCon();
		con=dbcon.getConnection();
	
	}
	public void insertcourse1()
	{
		String query="Insert into course1 values(?,?,?)";
		try
		{
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setString(1,"cse301");
			pst.setInt(2,444);
			pst.setString(3,"java");
			pst.executeUpdate();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public List<course1> getAll()
	{
		List<course1> courselist=new ArrayList<>();
		String SQL_SELECT="Select * from course1";
		
		try
		{
			Statement st=con.createStatement();
			ResultSet resultSet=st.executeQuery(SQL_SELECT);
			
			while(resultSet.next())
			{
				int rno=resultSet.getInt("RNO");
				String coursecode=resultSet.getString("COURSECODE");
				String coursename=resultSet.getString("COURSENAME");
				
				course1 obj=new course1();
				obj.setRno(rno);
				obj.setCoursename(coursename);
				obj.setCoursecode(coursecode);

				
				courselist.add(obj);
				
			}
			courselist.forEach(x->System.out.println(x));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return courselist;
	}
	
	
	public List<course1> getByCourseCode(String n)
	{
		List<course1> courselist=new ArrayList<>();
		String SQL_GETCOURSECODE="Select * from course1 where coursecode="+n;
		try
		{
			Statement st=con.createStatement();
			ResultSet resultSet=st.executeQuery(SQL_GETCOURSECODE);
			
				resultSet.next();
				int rno=resultSet.getInt("RNO");
				String coursecode=resultSet.getString("COURSECODE");
				String coursename=resultSet.getString("COURSENAME");
				
				course1 obj=new course1();
				obj.setRno(rno);
				obj.setCoursename(coursename);
				obj.setCoursecode(coursecode);

				
				courselist.add(obj);
				
			courselist.forEach(x->System.out.println(x));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return courselist;
	}
	public void updatecourse1(String n)
	{
	
		List<Student1> courselist=new ArrayList<>();
		String SQL_UPDATE="UPDATE course1 SET coursename = 'ds' WHERE coursecode ="+n;
		try {
		PreparedStatement pst=con.prepareStatement(SQL_UPDATE);
		pst.executeUpdate();}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		getByCourseCode(n);
		
	}
	public void DeleteCourse1(int n)
	{
		List<Student1> courelist=new ArrayList<>();
		String SQL_DELETE="DELETE FROM course1 where rno="+n;
		try {
			PreparedStatement pst=con.prepareStatement(SQL_DELETE);
			pst.executeUpdate();}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			System.out.println("Deleted successfully");
			getAll();
		
		
	}
}

