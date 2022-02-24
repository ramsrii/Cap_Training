import java.util.Scanner;
public class Assign16 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a valid password: ");
		String pass=s.next();
		char a[]=pass.toCharArray();
		boolean f1,f2;
		int n=pass.length();
		f1=true;
		if(n>8)
		{

		int up=0;
		int low=0,spl=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				up++;
			}
			if(a[i]>='a' && a[i]<='z')
			{
				low++;
			}
			if(a[i]=='@' || a[i]== '*' || a[i]=='#')
			{
				spl++;
			}
		}
		f2=false;
		if((low>0) && (up>0) &&(spl>0))
			f2=true;
		if(f1==true && f2==true)
		{
			System.out.println("valid");
			
		}
		}
		else
		{
			System.out.println("not valid");
		}
	
		
	}

}
