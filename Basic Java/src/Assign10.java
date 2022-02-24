import java.util.Scanner;
public class Assign10 {
	static int check(char A[], int l)

	   {

	       for(int i = 0; i < l; i++)

	       {

	           if((A[i] >= 0 && A[i] <= 31) || (A[i] >= 33 && A[i] <= 64) || (A[i] >= 91 && A[i] <= 96) || (A[i] >= 123 && A[i] <= 127))

	           {

	               return 1;

	           }

	       }
	       return 0;
	   }

	   public static void main(String args[])

	   {

	       Scanner Sc = new Scanner(System.in);

	       String s;

	       System.out.print("Enter a sentence : ");

	       s = Sc.nextLine();

	       char A[] = s.toCharArray();

	       int l = A.length;

	       int flag = 0;

	       if(check(A, l) == 1)

	       {

	           System.out.println("Invalid Sentence");

	       }

	       else

	       {

	           for(int i = 0; i < l; i++)

	           {

	               int count = 0;

	               for(int j = 0; j < l; j++)

	               {

	                   if(A[i] == A[j])

	                   {

	                       count++;

	                       if(count > 1)

	                       {

	                           break;

	                       }

	                   }

	               }

	               if(count == 1)

	               {

	                   flag = 1;

	                   System.out.println(A[i]);

	               }

	           }

	           if(flag == 0)

	           {

	               System.out.println("No unique characters");

	           }

	       }
	   }
}
	  
