package com.training.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Empdao {
	@Autowired
private DBdao obj;

	public Empdao() {
		super();
	}
	public Empdao(DBdao obj) {
		super();
		this.obj = obj;
	}
	public DBdao getobj()
	{
		return obj;}
	public void setobj(DBdao passObj)
	{
		this.obj=passObj;
	}
	
}