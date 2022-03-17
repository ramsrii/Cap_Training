package com.training.test;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.*;
@Component
public class Project {
	private int pid;
	private String pname;
	private Date startDate;
	private int size;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		return "Project [pid=" + pid + ", pname=" + pname + ", startDate=" + sdf.format(startDate) + ", size=" + size + "]";
	}
	
	

}
