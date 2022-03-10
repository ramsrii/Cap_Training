import java.sql.*;
import java.util.*;
import test.Student1;
public class Student1DAO {
	
	Connection con;
	public void getDbConnection()
	{
		JdbcCon dbcon=new JdbcCon();
		con=dbcon.getConnection();
	
	}
	public List<Student1> getAll()
	{
		List<Student1> studlist=new ArrayList<>();
		String SQL_SELECT="Select * from student1";
		
		try
		{
			Statement st=con.createStatement();
			ResultSet resultSet=st.executeQuery(SQL_SELECT);
			
			while(resultSet.next())
			{
				int rno=resultSet.getInt("RNO");
				String sname=resultSet.getString("SNAME");
				String email=resultSet.getString("EMAIL");
				int phone=resultSet.getInt("PHONE");
				
				Student1 obj=new Student1();
				obj.setRno(rno);
				obj.setSname(sname);
				obj.setEmail(email);
				obj.setPhone(phone);
				
				studlist.add(obj);
				
			}
			studlist.forEach(x->System.out.println(x));
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return studlist;
	}
	
	void insertStduent1()
	{
		String query="Insert into Student1 values(?,?,?,?)";
		try
		{
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setInt(1,121);
			pst.setString(2,"yamu");
			pst.setString(3,"yamu@gamil.com");
			pst.setInt(4,1786);
			pst.executeUpdate();
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	Student1 getByRno(int n)
	{
		return null;
	}
	void updateStudent1()
	{
		
	}
	

}
