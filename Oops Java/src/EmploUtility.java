import java.io.*;
import java.util.ArrayList;

public class EmploUtility {
    public boolean addEmployee(String fileName, ArrayList<Emplo> employeeList) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeList);

            return true;
        } catch (IOException ignore) {
        }

        return false;
    }
    public Emplo viewEmployeeById(String fileName, int employeeId) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<Emplo> employees = (ArrayList<Emplo>) objectInputStream.readObject();

            for (Emplo employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    return employee;
                }
            }
        } catch (IOException | ClassNotFoundException ignore) {}

        return null;
    }
}
