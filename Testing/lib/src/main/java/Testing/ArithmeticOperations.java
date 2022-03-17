package Testing;

public class ArithmeticOperations {
	int a,b;

public ArithmeticOperations(int a,int b)
{
	super();
	this.a=a;
	this.b=b;
}
public int add()
{
	int c=a+b;
	System.out.println("sum= "+c);
	return c;
}
public int sub()
{
	int d=a-b;
	System.out.println("diff= "+d);
	return a-b;
}
}
