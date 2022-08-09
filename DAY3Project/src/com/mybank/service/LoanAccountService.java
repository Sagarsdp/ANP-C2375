package com.mybank.service;

public class LoanAccountService {
	private int loanId;
	private int loanAmount;
	private int rateOfInterest;
	private int time;
	
	
	public int calculateInterest ( int Amount, int roi, int period ) {
	
		loanAmount = Amount;
		rateOfInterest =roi;
		time = period;
		int SI =(loanAmount*rateOfInterest*time)/100;
		return SI;
		
	}


	

}
