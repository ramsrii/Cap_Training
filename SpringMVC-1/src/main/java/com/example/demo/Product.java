package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Product {
	@Id
	int pid;
	String Pname;
	String pdesc;
	String domf;
	String doexp;
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
	public String getDomf() {
		return domf;
	}
	public void setDomf(String domf) {
		this.domf = domf;
	}
	public String getDoexp() {
		return doexp;
	}
	public void setDoexp(String doexp) {
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
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", Pname=" + Pname + ", pdesc=" + pdesc + ", domf=" + domf + ", doexp=" + doexp
				+ ", supplier=" + supplier + ", qty=" + qty + "]";
	}
	
	
}
