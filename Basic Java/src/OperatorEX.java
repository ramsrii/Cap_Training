class Calculator
{
	int num1;
	int num2;
	
	void addition()
	{
		int num3=0;
		num3=num1+num2;
		System.out.println("The Sum of  the Two numbers num1 and num2 is " + num3);
	}
	void subtraction()
	{
		int num3=num1-num2;
		System.out.println("The Subtract of  the Two numbers num1 and num2 is " + num3);
	}
	void primesmaller() {
		int num3=(num1>num2)?num2:num1;
		System.out.println("The Smallest  of  the Two numbers num1 and num2 is "+num3);
	}
	
}
public class OperatorEX {
	
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		c.num1=12;
		c.num2=8;
		
		c.addition();
		c.subtraction();
		c.primesmaller();
		
	}
	


}
