package com.training.test;
import java.util.Date;
import org.springframework.context.annotation.*;
@Configuration
@ComponentScan
public class ApplicationConfig {
	@Bean
	public Student1 student1()
	{
		Student1 student1=new Student1();
		
		student1.setSname("Ramu");
		student1.setEmail("djnka@gamial");
		student1.setPhone(3728);
		student1.setRno(12);
		
		return student1;
		
	}
	@Bean
	public Project pObj()
	{
		Project project=new Project();
		Date todayDate=new Date();
		project.setPid(6772);
		project.setSize(10);
		project.setPname("narayanan");
		
		project.setStartDate(todayDate);
		return project;
	}
	

}
