import java.util.Scanner;
public class QuadraticEquat
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        double a,b,c;      
        System.out.println("Enter the value of a");
        a=sc.nextDouble();  
        System.out.println("Enter the value of b");
        b=sc.nextDouble();    
        System.out.println("Enter the value of c");
        c=sc.nextDouble();   
        
        double d=(b*b)-(4*a*c);   
        double D= Math.sqrt(d);
        double r=2*a;
        
        if(D>0)
        {
            System.out.println("Roots are real and unequal");
            double root1=(D-b)/r;
            double root2=(-D-b)/r;
            System.out.println("Roots are "+root1+root2);
            
        }
        else if(D==0)
        {
            System.out.println("The roots of the quadratic equation are real and equal.");
            double root=(-b)/r;
            System.out.println("Root is "+root);
        }
        else
        {
            System.out.println("The roots of the quadratic equation are complex and different");
           
        }
     }
}