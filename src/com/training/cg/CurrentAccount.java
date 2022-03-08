package com.training.cg;

public class CurrentAccount extends AccountType{
	
	//final double INITIALAMOUNT=100000;
	//double totalamount;
	final double RATEOFINTEREST=5;
	public CurrentAccount(double InitialBalance)
	{
		this.InitialBalance=InitialBalance;
		this.TotalBalance=InitialBalance;
	}
}
