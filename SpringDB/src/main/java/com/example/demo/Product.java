package com.example.demo;

import java.util.Date;

public class Product {
	int pid;
	String Pname;
	String pdesc;
	Date domf;
	Date doexp;
	String supplier;
	int qty;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public Date getDomf() {
		return domf;
	}
	public void setDomf(Date domf) {
		this.domf = domf;
	}
	public Date getDoexp() {
		return doexp;
	}
	public void setDoexp(Date doexp) {
		this.doexp = doexp;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
