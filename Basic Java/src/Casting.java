
public class Casting {
	public static void main(String args[])
	{
		int mySal=500;
        long sal=mySal;   //implict casting
        System.out.println(sal);
        
        double pf=12.67;
        // float myPf=pf;	compile-time error.
        float myPf=(float) pf;
        System.out.println(myPf);


	}

}
