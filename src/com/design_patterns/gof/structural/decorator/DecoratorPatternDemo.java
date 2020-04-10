package com.design_patterns.gof.structural.decorator;

public class DecoratorPatternDemo {
	
	public static void main(String[] args) { 
		AbstractAccount account = new SavingAccount(1000.00);
		AbstractAccount smsManageableAccount = new SmsManageableAccountDecorator(account);

		account.verifyAccount();
		smsManageableAccount.verifyAccount();

		account = new CheckingAccount(1000.00, 100.00);
		smsManageableAccount = new SmsManageableAccountDecorator(account);
		
		account.verifyAccount();
		smsManageableAccount.verifyAccount();
		 
	}

}
