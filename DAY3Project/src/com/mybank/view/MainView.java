package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {
	
	public static void main(String[] args)
	{
		LoanAccountService Interest1 = new LoanAccountService();
		int Interest = Interest1.calculateInterest(126, 10000, 6, 4);
		System.out.println("Interest for loan ID "+Interest1.getLoanId()+" is "+ Interest);
	}

}
