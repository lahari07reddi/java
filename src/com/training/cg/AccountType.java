package com.training.cg;

public class AccountType implements Account {
	double InitialBalance;
	double TotalBalance;
	double AccountNumber;
	

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		TotalBalance=(InitialBalance+amount);
	}

	@Override
	public void withdraw(double amount) {
		if(TotalBalance<amount) {
			System.out.println("insufficient amount");
		}
		else
		{
			TotalBalance=(TotalBalance-amount);
		}
		
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return TotalBalance;
	}

	@Override
	public double getInterest(double timeperiod,double rateofinterest) {
		 double SI=(TotalBalance*(rateofinterest)*timeperiod)/100;
		return SI;
	}
	
}
