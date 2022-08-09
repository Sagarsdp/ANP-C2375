package com.mybank.service;

public class LoanAccountService {
	private int loanId;
	private int loanAmount;
	private int rateOfInterest;
	private int time;
	
	
	public int calculateInterest (int LoanId , int LoanAmount, int RateOfInterest, int Time ) {
		loanId = LoanId;
		loanAmount = LoanAmount;
		rateOfInterest =RateOfInterest;
		time = Time;
		int SI =(loanAmount*rateOfInterest*time)/100;
		return SI;
		
	}


	public int getLoanId() {
		return loanId;
	}


	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}


	public int getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}


	public int getRateOfInterest() {
		return rateOfInterest;
	}


	public void setRateOfInterest(int rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}

}
