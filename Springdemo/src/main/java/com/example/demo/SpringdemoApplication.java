package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.test.ApplicationConfig;
import com.training.test.Empdao;
import com.training.test.Rectangle;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringdemoApplication.class, args);
		//System.out.println("hello world");
		
		/*ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Employee obj1=(Employee) context.getBean("st");
		System.out.println(obj1);*/
		
		//ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		/*Student1 student1=(Student1) context.getBean(Student1.class);
		
		System.out.println("Student name: "+student1.getSname());
		System.out.println("Student Email: "+student1.getEmail());
		System.out.println(student1.getpObj().toString());*/
		
		/*Empdao empdao=(Empdao) context.getBean(Empdao.class);
		System.out.println("to the database");
		System.out.println(empdao.getobj().toString());*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Rectangle obj1=(Rectangle)context.getBean("rectangle");
		obj1.area();
		obj1.perimeter();
		
				
	
		
	}

}
