import java.util.*;
class EmployeeCapg
{
	String name;
	int salary;
	public EmployeeCapg(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
class EmployeeInfo
{
	public enum namedconstants{ BYNAME,BYSALARY}
	
	 public List<Employee> sort(List<EmployeeCapg> emps, final SortMethod method)
	 {
		 
	 }
	 public boolean isCharacterPresentInAllNames(Collection<EmployeeCapg> entities, String character)
	 {
		 
	 }
}
public class EmailOperation {
	public static void main(String[] args) {
		List<EmployeeCapg> emps = new ArrayList<>();
		emps.add(new EmployeeCapg("Mickey", 100000));
		emps.add(new EmployeeCapg("Timmy", 50000));
		emps.add(new EmployeeCapg("Annny", 40000));
	}

}
