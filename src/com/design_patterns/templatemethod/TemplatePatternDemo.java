package com.design_patterns.templatemethod;

public class TemplatePatternDemo {
	
	public static void main(String[] args) throws NotEnoughFundsException {
		AbstractAccount account = new CheckingAccount(1000.00, 200.00); 
		account.withdraw(1100.00);
		System.out.print(account);

		account = new SavingAccount(1000.00); 
		account.withdraw(1100.00);
		System.out.print(account);
	}

}
