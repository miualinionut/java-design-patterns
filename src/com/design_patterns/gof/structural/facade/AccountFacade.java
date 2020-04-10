package com.design_patterns.gof.structural.facade;

public class AccountFacade {
	
	public static SavingAccount createSavingAccount(double balance) {
		return new SavingAccount(balance);
	}

	public static CheckingAccount createCheckingAccount(double balance, double overdraft) {
		return new CheckingAccount(balance, overdraft);
	}

	public static void verifyAccount(AbstractAccount account) {
		account.verifyAccount();
	}

	public static void withdraw(AbstractAccount account, double amount) throws NotEnoughFundsException {
		account.withdraw(amount);
	}
	
	public static void deposit(AbstractAccount account, double amount) {
		account.deposit(amount);
	}

}
