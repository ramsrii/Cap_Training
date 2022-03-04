import java.sql.*;
import java.util.*;
import test.Student1;
public class UpdateSQL {	
	public static void main(String[] args)throws Exception {
		JdbcCon dbcon=new JdbcCon();
		Connection con=dbcon.getConnection();
		
		List<Student1> studlist=new ArrayList<>();
		String query="Insert into Student1 values(?,?,?,?)";
		String select="select * from student1";
		
		try
		{
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setInt(1,145);
			pst.setString(2,"ram");
			pst.setString(3,"ram@gamil.com");
			pst.setInt(4,1122);
			pst.executeUpdate();
			Statement st=con.createStatement();
			ResultSet resultSet=st.executeQuery(select);
			
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