package com.Train.services;
import java.util.*;
import com.Train.dao.*;
import com.Train.models.*;

public class TrainServices {
	public static void main(String [] args) throws Exception {
		TrainDAO td = new TrainDAO();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Source");
		String source = sc1.nextLine();
		System.out.println("Enter Destination");
		String dest = sc1.nextLine();
		System.out.println("Enter Coach");
		String coach = sc1.nextLine();
		ArrayList<Train> list = td.viewTrain(coach, source, dest);
		list.forEach(x->System.out.println(x));
		sc1.close();
	}
}