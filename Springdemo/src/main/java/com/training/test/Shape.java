package com.training.test;

public abstract class Shape {
	float dim1;
	float dim2;
	
	public Shape(float dim1,float dim2) {
		super();
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public abstract void area();
	public abstract void perimeter();
	

}
