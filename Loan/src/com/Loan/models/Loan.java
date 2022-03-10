package com.Loan.models;

import java.util.Arrays;

public class Loan {
	int loanId;
	String name;
	String loanType;
	String contactNumber;
	double rateOfInterest;
	double tensureOfLoan;
	public Loan()
	{
		super();
	}
	public Loan(int loanId, String name, String loanType, String contactNumber, double rateOfInterest,double tensureOfLoan) 
	{
		super();
		this.loanId = loanId;
		this.name = name;
		this.loanType = loanType;
		this.contactNumber = contactNumber;
		this.rateOfInterest = rateOfInterest;
		this.tensureOfLoan = tensureOfLoan;
	}
	
	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getTensureOfLoan() {
		return tensureOfLoan;
	}

	public void setTensureOfLoan(double tensureOfLoan) {
		this.tensureOfLoan = tensureOfLoan;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", name=" + name + ", loanType=" + loanType + ", contactNumber="
				+ contactNumber + ", rateOfInterest=" + rateOfInterest + ", tensureOfLoan=" + tensureOfLoan + "]";
	}

}