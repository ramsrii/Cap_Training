package com.capg.project;
import com.capg.geometry.*;
import java.util.*;
public class StudentMain {
	public static void main(String args[])
	{
		Student s=new Student();
		s.setRollno(162);
		s.setName("diva");
		s.setPhonenum(734284);
		s.setSec('B');
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getPhonenum());
		System.out.println(s.getSec());
		
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(s);
		System.out.println(a);
		
		Map<Integer,Student> m=new HashMap<Integer,Student>();
		m.put(0,s);
		System.out.println(m);
		
		Set<Student> se=new TreeSet<Student>();
		se.add(s);
		System.out.println(se);

	}
}
