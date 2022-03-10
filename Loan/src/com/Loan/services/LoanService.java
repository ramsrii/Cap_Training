package com.Loan.services;
import java.util.Scanner;
import com.Loan.DAO.LoanDAO;
public class LoanService {
	public static void main(String[] args) throws Exception {
		Scanner  ss= new Scanner(System.in);
		LoanDAO l = new LoanDAO();
		String loanType,choice;
		while(true) {
			System.out.println("enter yes if u want to check the count?");
			choice = ss.nextLine();
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("Enter the type of loan to be searched");
				loanType = ss.nextLine();
				System.out.println(l.viewLoanCountBasedOnType(loanType));
			}else {
				System.out.println("Thank you for using this application");
				break;
			}
		}
	}
}