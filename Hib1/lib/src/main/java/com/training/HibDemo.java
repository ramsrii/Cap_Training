package com.training;
import java.io.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class HibDemo 
{
	public static void main(String[] args)
	{
		String confFile="hibernate.cfg.xml";
		
		ClassLoader classLoader=HibDemo.class.getClassLoader();
		File f=new File(classLoader.getResource(confFile).getFile());
		
		SessionFactory sessionFactory=new Configuration().configure(f).buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		//insertEmployees(session);
		//updateEmployees(session);
		deleteEmployees(session);
		getEmployees(session);
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
	private static void updateEmployees(Session session)
	{
		Employee employees=new Employee();
		employees=(Employee) session.get(Employee.class,123);
		employees.setName("sriram");
		session.update(employees);
		
		session.getTransaction().commit();
		
	}
	private static void deleteEmployees(Session session)
	{
		Employee employees=new Employee();
		employees=(Employee) session.get(Employee.class,332);
		session.delete(employees);
	}
	

}
