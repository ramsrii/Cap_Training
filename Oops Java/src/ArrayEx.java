import java.util.*;
class Student
{
	int sno;
	String name;
	int marks[];
    double avg;
    int n;//no of subjects
    void input()
    {
    	Scanner sc = new Scanner(System.in);
    	sno=sc.nextInt();
    	name =sc.next();
    	System.out.println("Enter the no of mark/subjects");
    	n=sc.nextInt();
    	marks=new int[n];
    	for(int i=0;i<n;i++)
    		marks[i]=sc.nextInt();

    }
    void process()
    {
       double tot=0;
       for(int i=0;i<n;i++)
       	tot+=marks[i];
       avg=tot/n;
    }
    public String toString()
    {
    	return (sno+" "+name+" "+avg+" ");
    }
}
public class ArrayEx
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student s[]=new Student[n];
	  /* for(int i=0;i<n;i++)
	   {s[i]=new Student();
		s[i].input();
		s[i].process();
	   }
	   for(int i=0;i<n;i++)
		System.out.println(s[i]);*/
	//using temp instance
	for(int i=0;i<n;i++)
	   {Student s1=new Student();
		s1.input();
		s1.process();
		s[i]=s1;
	   }
	   for(int i=0;i<n;i++)
		System.out.println(s[i]);

	}
}