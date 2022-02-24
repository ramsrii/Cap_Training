class Employee
{
	int id=89;                  //instance variable
	String name;
	
	void display()
	{
		System.out.println(id);
		
	}
}
public class variables {
	
	int a=10;    //instance
	public static void main(String args[])
	{
		int b=10;     // method local vari
		Employee e=new Employee();   //e is ref variable
		e.display();
		
	}
	void mymethod()
	{
		int c;    //method local vari
		int d;
		System.out.println(a);
	}

}
