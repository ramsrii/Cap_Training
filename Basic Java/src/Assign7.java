import java.util.Scanner;
public class Assign7 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Invalid");
		}
		else if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				if(n % i==0)
				{
					System.out.println(i+" ");
				}
			}
		}
		else
		{

            n=n*-1;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    System.out.print(i+", ");

                }

            }
		}
	}
				
}
