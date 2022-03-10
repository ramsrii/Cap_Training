package com.Flight.services;
import java.util.Scanner;
import com.Flight.dao.FlightDAO;
import com.Flight.models.Flight;
public class FlightServices
{
		public static void main(String [] args) throws Exception 
		{
			Flight f;
			FlightDAO fd = new FlightDAO();
			Scanner ss = new Scanner(System.in);
			Scanner ss2=new Scanner(System.in);
			while(true) 
			{
				fd.display();
				System.out.println("add a new flight info? then enter yes");
				if(ss2.nextLine().equalsIgnoreCase("yes")) 
				{
					System.out.println("Enter the id, source, destination, number of seats and fare");
					int id = ss.nextInt();
					String source = ss2.nextLine();
					String dest = ss2.nextLine();
					int noOfSeats = ss.nextInt();
					double flightFare = ss.nextDouble();
					f = new Flight(id,source,dest,noOfSeats,flightFare);
					boolean b = fd.addFlight(f);
					if(b==true)
						System.out.println("Flight details added successfully");
					else
						System.out.println("Addition not done");
				}
				else 
				{
					System.out.println("Thank you");break;
				}
				
			}
		}
	}
