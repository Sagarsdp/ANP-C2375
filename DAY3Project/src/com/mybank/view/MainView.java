package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {
	
	public static void main(String[] args)
	{
		LoanAccountService interest1 = new LoanAccountService();
		int Interest = interest1.calculateInterest( 10000, 6, 6);
		System.out.println("Interest for   is "+ Interest);
	}

}
