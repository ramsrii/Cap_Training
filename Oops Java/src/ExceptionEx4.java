import java.util.Scanner;

class CountryNotValidException extends Exception{
	String ss="";
	CountryNotValidException(String cn){
		ss =cn;
	}
	public String toString() {
		return ss;
	}
}
class EmployeeNameInvalidException extends Exception{
	String ss="";
	EmployeeNameInvalidException(String en){
		ss =en;
	}
	public String toString() {
		return ss;
	}
}
class TaxNotEligibleException extends Exception{
	String ss="";
	TaxNotEligibleException(String te){
		ss =te;
	}
	public String toString() {
		return ss;
	}
}
class TaxCalculator{
	String empName;
	boolean isIndian;
	double empSal;
	
	public TaxCalculator(String empName, boolean isIndian, double empSal) {
		super();
		this.empName = empName;
		this.isIndian = isIndian;
		this.empSal = empSal;
	}

	public double calculateTax() throws Exception{
		double tax = 0;
		if(isIndian == false)
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		else if(empName.equalsIgnoreCase("null") || empName.length() == 0)
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		else if(empSal>100000)
			tax = empSal * 0.08;
		else if(empSal>50000)
			tax = empSal * 0.06;
		else if(empSal>30000)
			tax = empSal * 0.05;
		else if(empSal>10000)
			tax = empSal * 0.04;
		else
			throw new TaxNotEligibleException("Tax not eligible");
		return tax;
	}
}
public class ExceptionEx4 {
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		String name = s.nextLine();
		boolean indian = n.nextBoolean();
		double salary = n.nextDouble();
		try {
			TaxCalculator t = new TaxCalculator(name,indian,salary);
			double ans = t.calculateTax();
			System.out.println(ans);
		}catch(CountryNotValidException cn) {
			System.out.println(cn);
		}catch(EmployeeNameInvalidException ee) {
			System.out.println(ee);
		}catch(TaxNotEligibleException tn) {
			System.out.println(tn);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}



