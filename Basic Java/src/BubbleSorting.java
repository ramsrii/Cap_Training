import java.util.Scanner;
public class BubbleSorting 
{
public static void main(String args[])
{
	int n;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;}
		}
	}
	System.out.println("Acesending Order");
	for (int i = 0; i < n ; i++) 
    {
        System.out.print(a[i] + " ");
    }
    
	
}
}
