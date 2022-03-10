package com.course1.model;

public class course1 {
	private int rno;
	private String coursename;
	private String coursecode;
	
	public course1()
	{
		super();
	}

	public course1(int rno, String coursename, String coursecode) {
		super();
		this.rno = rno;
		this.coursename = coursename;
		this.coursecode = coursecode;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	@Override
	public String toString() {
		return "course1 [rno=" + rno + ", coursename=" + coursename + ", coursecode=" + coursecode + "]";
	}
	
	
	

}
