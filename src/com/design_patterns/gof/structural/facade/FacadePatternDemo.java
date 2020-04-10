package com.design_patterns.gof.structural.facade;

public class FacadePatternDemo {
	
	public static void main(String[] args) throws NotEnoughFundsException {
		
		SavingAccount savingAccount = AccountFacade.createSavingAccount(800.00);
		CheckingAccount checkingAccount = AccountFacade.createCheckingAccount(1000.00, 200.00);

		AccountFacade.verifyAccount(savingAccount);
		AccountFacade.verifyAccount(checkingAccount);

		AccountFacade.withdraw(savingAccount, 200);
		AccountFacade.deposit(checkingAccount, 200);

		AccountFacade.verifyAccount(savingAccount);
		AccountFacade.verifyAccount(checkingAccount);
	}

}
