package com.capg.training;

public class A {
private int x;
public int y;
protected int z;
int g;
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
void meth()
{
	x=12;
	z=50;
}
void dis()
{
	g=66;
}


}
class P{
	void method()
	{
		A obj1=new A();
		A obj2=new A();
		obj1.setX(10);
		obj2.getX();
		obj1.z=10;
		obj1.g=60;
		obj1.dis();
	}
}
