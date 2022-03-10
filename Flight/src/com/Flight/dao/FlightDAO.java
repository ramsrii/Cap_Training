package com.Flight.dao;
import java.sql.*;
import java.util.*;
import com.Flight.models.*;
public class FlightDAO {
	Connection con;
	PreparedStatement pt;
	ArrayList<Flight> flist = new ArrayList<Flight>();
	public FlightDAO() throws Exception{
		JdbcConFlight jdbc = new JdbcConFlight();
		con =  jdbc.getConnection();
		String SQL_SELECT = "select * from Flight order by flightid";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_SELECT);
		while(rs.next()){
			int id = rs.getInt("flightId"); 
			String source = rs.getString("source");
			String destination = rs.getString("destination");
			int noOfSeats = rs.getInt("noOfSeats"); 
			double flightFare = rs.getDouble("flightFare");
			Flight f  = new Flight(id,source,destination,noOfSeats,flightFare);
			flist.add(f);
		}
	}
	public boolean addFlight(Flight f) {
		boolean b = true;
		try 
		{
			String SQL_INSERT = "insert into Flight values(?,?,?,?,?)";
			pt = con.prepareStatement(SQL_INSERT);
			pt.setInt(1,f.getFlightid());
			pt.setString(2,f.getSource());
			pt.setString(3,f.getDestination());
			pt.setInt(4,f.getNoofseats());
			pt.setDouble(5, f.getFlightfare());
			pt.execute();
			flist.add(f);
		}
		catch(Exception se) {
			b = false;
		}
		return b;
		
	}
	public void display() 
	{
		System.out.println(flist);
	}
}


