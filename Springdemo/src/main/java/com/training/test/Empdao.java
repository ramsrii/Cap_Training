package com.training.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Empdao {
	@Autowired
private DBUtil obj;

	public Empdao() {
		super();
	}
	public Empdao(DBUtil obj) {
		super();
		this.obj = obj;
	}
	public DBUtil getobj()
	{
		return obj;}
	public void setobj(DBUtil passObj)
	{
		this.obj=passObj;
	}
	
}