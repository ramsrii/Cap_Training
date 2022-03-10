package com.Student1.service;

import com.Student1.dao.Student1DAO;

public class Student1Service {
	public static void main(String[] args) {
		Student1DAO obj=new Student1DAO();
		obj.getDbConnection();
		//obj.insertStudent1();
		//obj.getAll();
		obj.getByRno(133);
		//obj.updateStudent1(121);
		//obj.DeleteStudent1(121);
		
	}

}
