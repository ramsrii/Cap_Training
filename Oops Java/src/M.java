import java.util.*;
class AgeException extends Exception
{
	public void print()
	{
		System.out.println("Enter the positive age");
	}
	public String toString()
	{
		return ("Age is negative");
	}
}
class AE
{
	int age;
	void input()throws AgeException
	  { Scanner sc = new Scanner(System.in);
	  System.out.println("Enter ur age");
	  	age=sc.nextInt();
	  	
			if(age<0)
			{  throw new AgeException();     //AgeException ae=new AgeException();
		    }
			else
			{
				System.out.println("thank u for ur respose");
			}
}
}
public class M {
	public static void main(String[] args) {
		AE s=new AE();
		try
		{
			s.input();
		}
		catch(AgeException ae)
		{
			System.out.println(ae);
			ae.print();
		}
	}
}



