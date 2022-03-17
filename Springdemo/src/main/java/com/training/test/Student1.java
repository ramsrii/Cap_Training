package com.training.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student1 {
	private int rno;
	private String sname;
	private String email;
	private int phone;
	
	@Autowired
	private Project pObj;

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Project getpObj() {
		return pObj;
	}

	public void setpObj(Project pObj) {
		this.pObj = pObj;
	}

	@Override
	public String toString() {
		return "Student1 [rno=" + rno + ", sname=" + sname + ", email=" + email + ", phone=" + phone + ", pObj=" + pObj
				+ "]";
	}
	
	


}
