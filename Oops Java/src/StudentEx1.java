
public class StudentEx1 {
	private int studentId;
    private String studentName, studentAddress, collegeName;
    
    public StudentEx1(int studentId, String studentName, String studentAddress)
    {
        this.studentAddress=studentAddress;
        this.studentName=studentName;
        this.studentId=studentId;
        this.collegeName="NIT";
    }
    
    public StudentEx1(int studentId, String studentName, String studentAddress, String collegeName)
    {
        this(studentId, studentName, studentAddress);
        this.collegeName=collegeName;
    }
    
    public int getStudentId()
    {
        return this.studentId;
    }
    
    public String getStudentName()
    {
        return this.studentName;
    }
    
    public String getStudentAddress()
    {
        return this.studentAddress;
    }
    
    public String getCollegeName()
    {
        return this.collegeName;
    }

}
