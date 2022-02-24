package com.capg.shapes;
public class Circle {
	private float radius;
	protected float pi;
	
	public Circle(){
	 this(1.5f);
	}
	protected Circle(float radius)
	{
		this(radius,3.5f);
		this.radius=radius;
	}
	private Circle(float radius,float pi)
	{
		this.radius=radius;
		this.pi=pi;
	}
	float calculateCircleArea(float r)
	{
		return (this.pi*r*r);
	}
	float calculateCircumference(float r)
	{
		
		return(2*this.pi*r);
	}
	public void getradius()
	{
		System.out.println(radius);
	}
	public static void main(String args[])
	{
		Circle ci=new Circle();
		ci.getradius();
		float area=ci.calculateCircleArea(4.6f);
		float circumference=ci.calculateCircumference(13.4f);
		System.out.println(area);
		System.out.println(circumference);
		
		
	}
	
	

}
