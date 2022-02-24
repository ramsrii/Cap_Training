import java.util.*;
public class Assign15 {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	String str=s.next();
	if(str.matches("[A-Z]{3}[/]{1}[0-9]{3}[/]{1}[0-9]{4}"))
			{
				System.out.println("login sucessfully");
			}
	else
	{
		System.out.println("Invalid");
	}
}
}
