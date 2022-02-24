import java.util.Scanner;
public class Assign6 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Salary");
		int sal=s.nextInt();
		System.out.println("Enter the performance level");
		double rat=s.nextDouble();
		
		if((rat>0 && rat<=5)&& sal>0)
		{
		
		if(rat>=1 && rat<=3)
        {
            sal = sal+((sal*10)/100);
        }
        else if(rat>=3.1 && rat<=4)
        {
            sal = sal+((sal*25)/100);
        }
        else if(rat>=4.1 && rat<=5)
        {
            sal = sal +((sal*30)/100);
        }
        System.out.println(sal);
		}
		 else
		 {
			 System.out.println("Invalid Input");
		 }
			
		
	}

}
