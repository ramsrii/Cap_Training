import java.util.ArrayList;
import java.util.Arrays;
public class EmploMain {
	
	    public static void main(String[] args) {
	        Emplo employee = new Emplo(101, "Ritam", 9.5f);
	        Emplo employee1 = new Emplo(102, "Asif", 8.5f);
	        ArrayList<Emplo> employees = new ArrayList<>(Arrays.asList(employee, employee1));
	        EmploUtility employeeUtility = new EmploUtility();
	        employeeUtility.addEmployee("database.emp", employees);
	        Emplo employee2 =  employeeUtility.viewEmployeeById("database.emp", 101);
	        System.out.println(employee2.getName());
	    }
	}

