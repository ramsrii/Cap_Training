import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DBCCon {
	public static void main(String args[])throws SQLException
	{
		System.setProperty("Jdbc.drivers","org.postgresql.Driver");
		Properties properties=new Properties();
		properties.put("user","postgres");
		properties.put("password","Narayanan.s");
		String url="jdbc:postgresql://localhost:5432/postgres";
		Connection con=DriverManager.getConnection(url,properties);
		System.out.println("Connection Established: "+ con);
	}

}
