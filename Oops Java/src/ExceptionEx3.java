import java.util.*;
class Candidate {
    private String name;
    private String gender;
    private double expectedSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }
}
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}
public class ExceptionEx3 {
	public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the candidate Details");

        System.out.println("Name");
        String name = scanner.next();

        System.out.println("Gender");
        String gender = scanner.next();

        System.out.println("Expected Salary");
        double salary = scanner.nextDouble();

        if (salary < 10000) {
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        } else {
            Candidate candidate = new Candidate();
            candidate.setName(name);
            candidate.setGender(gender);
            candidate.setExpectedSalary(salary);

            return candidate;
        }
    }
	public static void main(String[] args) {
        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful");
        } catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}

