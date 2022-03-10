package com.Student1.service;

import com.Student1.dao.Student1DAO;
import com.course1.dao.course1DAO;

public class Student1Service {
	public static void main(String[] args) {
		//Student1DAO obj=new Student1DAO();
		//obj.getDbConnection();
		//obj.insertStudent1();
		//obj.getAll();
		//obj.getByRno(133);
		//obj.updateStudent1(121);
		//obj.DeleteStudent1(121);
		course1DAO obj1=new course1DAO();
		obj1.getDbConnection();
		//obj1.insertcourse1();
		obj1.getAll();
		obj1.getByCourseCode("'cse301'");
		
		
		
	}

}
