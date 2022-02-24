import java.util.Scanner;
public class Assign2 {
	public static void main(String args[])
	{
		double lit,dis;
		double convmile,convgalo,milgalo,fuelcom;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank: ");
		lit=n.nextInt();
		System.out.println("Enter the distance covered: " );
		dis=n.nextInt();
		if(lit<=0 && dis<=0)
		{
			System.out.println("Invalid Input");
		}
		fuelcom=(lit/dis)*100;
		convmile=dis*0.6214;
		convgalo=lit*0.2642;
		milgalo=(convmile/convgalo);
		String lpk=String.format("%.2f",fuelcom);
        String mpg=String.format("%.2f",milgalo);
        System.out.println("\nLiters/100KM\n"+lpk);
        System.out.println("\nMiles/gallons\n"+mpg);

		
		
	}

}
