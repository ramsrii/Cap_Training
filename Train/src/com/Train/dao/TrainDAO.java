package com.Train.dao;
import java.sql.*;
import java.util.ArrayList;
import com.Train.models.*;
public class TrainDAO {
		Train t = new Train();
		Connection con;
		PreparedStatement pt;
		ArrayList<Train> list = new ArrayList<Train>();
		public TrainDAO() throws Exception{
			JdbcConTrain jdbc = new JdbcConTrain();
			con =  jdbc.getConnection();
			String SQL_SELECT = "select * from Train order by trainNumber";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(SQL_SELECT);
			while(rs.next()){
				int number = rs.getInt("trainNumber"); 
				String name = rs.getString("trainName");
				String source = rs.getString("source");
				String destination = rs.getString("destination");
				int ac1 = rs.getInt("ac1");
				int ac2 = rs.getInt("ac2");int ac3 = rs.getInt("ac3");
				int sleeper = rs.getInt("sleeper");
				int seater = rs.getInt("seater");
				Train t =  new Train(number,name,source,destination,ac1,ac2,ac3,sleeper,seater);
				list.add(t);
			}
			list.forEach(x->System.out.println(x));
		}
		public ArrayList<Train> viewTrain(String coachType, String source, String destination) {
			ArrayList<Train> trainList = new ArrayList<Train>();
			String SQL_SELECT = "select * from Train where source = ? and destination = ? and "+coachType +">0";
			try {
				pt = con.prepareStatement(SQL_SELECT);
				pt.setString(1, source);
				pt.setString(2, destination);
				ResultSet rs = pt.executeQuery();
				while(rs.next()) {
					int number = rs.getInt("trainNumber");
					t.setTrainNumber(number);
					String name = rs.getString("trainName");
					t.setTrainName(name);
					String sour = rs.getString("source");
					t.setSource(sour);
					String dest = rs.getString("destination");
					t.setDestination(dest);
					int ac1 = rs.getInt("ac1");
					t.setAc1(ac1);
					int ac2 = rs.getInt("ac2");
					int ac3 = rs.getInt("ac3");
					t.setAc2(ac2);t.setAc3(ac3);
					int sleeper = rs.getInt("sleeper");
					t.setSleeper(sleeper);
					int seater = rs.getInt("seater");
					t.setSeater(seater);
					
					trainList.add(t);
				}
				if(trainList.size()==0)
				{
					System.out.println("No trains found");
				}
			}
			catch(Exception e) 
			{
				System.out.println(coachType+" is not valid");
			}
			return trainList;
		}
}

