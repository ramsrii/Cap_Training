package com.bus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="admin_info")
@Component("admin")
public class Admin {
	
	@Id @Column(name="admin_id")
	private int adminId;
	
	private String password;
	private String name;
	
	
	private String email;
	private long contact;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", contact=" + contact + "]";
	}
	

	

}
