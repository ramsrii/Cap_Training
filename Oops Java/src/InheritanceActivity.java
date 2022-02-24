class Employee
{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	Employee(long Id,String name,String address,long phone){
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
	}
	Employee(String name,String address,long Id,long phone){
		employeeId=Id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
	}
	void calculateSalary()
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
		System.out.println(salary);

	}
	void calculateTransportAllowance()
	{
		double transportAllowance = (10*basicSalary)/100;
		double Salary=basicSalary-transportAllowance;
		System.out.println(Salary);
	}
		
}
class Manager extends Employee
{
	Manager(long Id,String name,String address,long phone,double salary)
	{
	
		super(Id,name,address,phone);
		basicSalary=salary;
	}
	void calculateTransportAllowance()
	{
		double transportAllowance = 15*basicSalary/100;
		double Salary=basicSalary-transportAllowance;
		System.out.println(Salary);
	}
}
class Trainee extends Employee
{
	Trainee(long Id,String name,String address,long phone,double salary)
	{
	
		super(name,address,Id,phone);
		basicSalary=salary;
	}
}
public class InheritanceActivity {
	public static void main(String args[])
	{
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		m.calculateSalary();
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();
		m.calculateTransportAllowance();
		t.calculateTransportAllowance();
		
		
	}

}
