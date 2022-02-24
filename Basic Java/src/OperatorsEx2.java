class Calc
{
	int num1;
	int num2;
	
	void bitwiseAND()
	{
		int num3=num1 & num2;
		System.out.println("Bitwise AND of  the Two numbers num1 and num2 is "+num3); 
	}
	void bitwiseOR()
	{
		int num3=num1 | num2;
		System.out.println("The Bitwise OR of  the Two numbers  num1 and num2 is  "+num3);
	}
	void bitwiseXOR()
	{
		int num3=num1 ^ num2;
		System.out.println("The Bitwise XOR of  the Two numbers num1 and num2 is  "+num3);
	}
	void bitwiseNOT()
	{
		int num3=~num1;
		System.out.println("The Bitwise NOT Result of  the  number num1  is "+num3);
	}
	
}
public class OperatorsEx2 
{
	public static void main(String args[])
	{
		Calc c=new Calc();
		c.num1=15;
		c.num2=5;
		
		c.bitwiseAND();
		c.bitwiseOR();
		c.bitwiseXOR();
		c.bitwiseNOT();
		
	}
}
