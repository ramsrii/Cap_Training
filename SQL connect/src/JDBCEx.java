import java.sql.*;
import java.util.*;
import test.Student1;
public class JDBCEx {	
	public static void main(String[] args) {
		JdbcCon dbcon=new JdbcCon();
		Connection con=dbcon.getConnection();
		
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
		
	}
}
