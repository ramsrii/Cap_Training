package test;

public class Student1 {
	private int rno;
	private String sname;
	private String email;
	private int phone;
	public Student1()
	{
		super();
	}
	public Student1(int rno, String sname, String email, int phone) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.email = email;
		this.phone = phone;
	}
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
	@Override
	public String toString() {
		return "Student1 [rno=" + rno + ", sname=" + sname + ", email=" + email + ", phone=" + phone + "]";
	}
	


}
