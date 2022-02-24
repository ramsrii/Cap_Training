import java.util.Scanner;
public class Assign5 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num;
		int n,sum=0;
		while(num>0)
		{
			n=num%10;
			sum=(sum*10)+n;
			num=num/10;
		}
		 if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");
	}

}
