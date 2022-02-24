class Employe
{
	long empId=345;
	Double empSalary=1000.0;
	float empTax=9.5f;
	int empDayOfWork=24;
	
	void calculatePF()
	{
		float pfRate=10.5f;
		System.out.println("The  PF  Rate Of The Employee is "+pfRate);
	}
}
public class VariableEx 
{
	public static void main(String args[])
	{
	Employe e=new Employe();
	e.calculatePF();
	System.out.println("The  Id  of the Employee is "+ e.empId);
	System.out.println("The Salary of The Employee is "+e.empSalary);
	System.out.println("The  Percentage of Tax  The Employee needs to Pay is "+e.empTax);
	System.out.println("The  Total  Number  of Working Days  is "+e.empDayOfWork);
	
	}
	
}
