package com.training;

import java.util.List;
import java.util.Properties;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibDemo2 {
	public static void main(String [] args) {
		Properties properties = new Properties();
		try {
			properties.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
		}catch(Exception e) {
			System.out.println("cannot load properties file");
		}
		SessionFactory sessionFactory = new Configuration().mergeProperties(properties).addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		getEmployees(session);
		//insert(session);
		session.close();
		
	}
	private static void getEmployees(Session session)
	{
		Query query=session.createQuery("FROM Employee");
		List<Employee> Employees=query.list();
		//Employees.forEach(obj->System.out.println(obj.getRno()));
		System.out.println("Reading Employee records....");
		for(Employee employeeObj:Employees)
		{
			System.out.println("Rollno---- "+employeeObj.getRno());
			System.out.println("age----"+employeeObj.getAge());
			System.out.println("Name----"+employeeObj.getName());
			System.out.println("des----"+employeeObj.getDes());
		}
		
	}
	private static void insertEmployees(Session session)
	{
		Employee employees=new Employee();
		employees.setRno(332);
		employees.setAge(22);
		employees.setName("lakshmana");
		employees.setDes("data Analyst");
		
		session.save(employees);
		session.getTransaction().commit();
	}
	

}
