package com.training.cg;

import java.util.HashSet;
import java.util.Set;

public class Bank_demo {
	public static void main(String args[])
	{
		SavingAccount sa1 = new SavingAccount(5000,1000123);
		SavingAccount sa2 = new SavingAccount(6000,1000124);
		SavingAccount sa3 = new SavingAccount(7000,1000125);
		SavingAccount sa4 = new SavingAccount(8000,1000126);	
		
		Set<SavingAccount> allsav = new HashSet<SavingAccount>();
		allsav.add(sa1);
		allsav.add(sa2);
		allsav.add(sa3);
		allsav.add(sa4);
		for(SavingAccount sa:allsav)
		{
			sa.deposit(2000);
			sa.withdraw(500);
			System.out.println("the account Number is"+sa.AccountNumber+"the balance is "+sa.checkBalance());
			System.out.println(sa.getInterest(1,5));
	}

}
}
