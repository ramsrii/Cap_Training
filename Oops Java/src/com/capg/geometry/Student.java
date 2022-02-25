package com.capg.geometry;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	long Phonenum;
	char Sec;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenum() {
		return Phonenum;
	}
	public void setPhonenum(long phonenum) {
		Phonenum = phonenum;
	}
	public char getSec() {
		return Sec;
	}
	public void setSec(char sec) {
		Sec = sec;
	}
	
	public String toString()
	{
		return (rollno+" "+name+" "+Phonenum+" "+Sec); 
	}
	public int compareTo(Student s)
	{
		return (s.name.compareTo(name));
	}
	

}
