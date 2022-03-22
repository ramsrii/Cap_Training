package com.training.test;

public class Rectangle extends Shape{
Rectangle(float x,float y)
{
	super(x,y);
}
	@Override
	public void area()
	{
		System.out.println("Area of Rectangle ="+dim1*dim2);
	}
	@Override
	public void perimeter()
	{
		double p=2.0*(dim1+dim2);
		System.out.println("Perimeter of Rectangle = "+p);
	}

}
