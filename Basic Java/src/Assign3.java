import java.util.Scanner;
public class Assign3 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month");
		int n=s.nextInt();
		switch(n)
		{
        case 12:
        case 1:
        case 2:
        System.out.println("Winter");
        break;
        case 3:
        case 4:
        case 5:
        System.out.println("Spring");
        break;
        case 6:
        case 7:
        case 8:
        System.out.println("Summer");
        break;
        case 9:
        case 10:
        case 11:
        System.out.println("Autumn");
        break;
        default:
        	System.out.println("Invalid month");
			
		
		}
	}

}
