package com.training.cg;

public class Bank_demo {
	public static void main(String args[])
	{
		SavingAccount sa1 = new SavingAccount(5000);
		sa1.deposit(4000);
		sa1.withdraw(2000);
		System.out.println(sa1.checkBalance());
		sa1.withdraw(1000);
		System.out.println(sa1.checkBalance());
	}

}
