package com.capg.project;
class D {
 static int  totalseats=100;
void issueticket(int x)
{
	totalseats=totalseats-x;
	System.out.println("Total seats available= "+totalseats);
	
}
}
public class E
{
	public static void main(String[] args) {

	D obj1=new D();
	System.out.println(D.totalseats);
	obj1.issueticket(5);
	System.out.println(D.totalseats);
	D obj2=new D();
	System.out.println(D.totalseats);
	obj2.issueticket(20);
	System.out.println(D.totalseats);
	}
}
