package com.training.cg;

public interface Account {

	public void deposit(double amount);
	public void withdraw(double amount);
	public double checkBalance();
	public double getInterest(double timeperiod,double rateofinterest);
}
