package com.Loan.DAO;
import java.util.*;
import java.sql.*;
import com.Loan.models.*;
public class LoanDAO {
	Connection con;
	PreparedStatement pst;
	ArrayList<Loan> list = new ArrayList<Loan>();
	public LoanDAO() throws Exception{
		JdbcConLoan jdbc = new JdbcConLoan();
		con =  jdbc.getConnection();
		String SQL_SELECT = "select * from Loan order by loanId";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_SELECT);
		while(rs.next()){
			int loanId = rs.getInt("loanId"); 
			String name = rs.getString("name");
			String loanType = rs.getString("loanType");
			String contactNumber = rs.getString("contactNumber");
			double rateOfInterest = rs.getDouble("rateOfInterest");
			double tensureOfLoan = rs.getDouble("tensureOfLoan");
			Loan lo = new Loan(loanId,name,loanType,contactNumber,rateOfInterest,tensureOfLoan);
			list.add(lo);
			
		}System.out.println(list);
	}
	public int viewLoanCountBasedOnType (String lt) throws Exception {
		int count = 0 ;
		String SQL_COUNT = " select count(*) as total from Loan where loanType='"+lt+"'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(SQL_COUNT);
		while(rs.next())
			count = rs.getInt("total");
		return count;
	}

}
