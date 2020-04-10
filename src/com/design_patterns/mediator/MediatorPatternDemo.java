package com.design_patterns.mediator;

public class MediatorPatternDemo {
	
	public static void main(String[] args) throws NotEnoughFundsException { 
		
		Bank alphaBank = new Bank();
		Bank betaBank = new Bank();
		
		MoneyTransferService.bankMap.put("Alpha", alphaBank);
		MoneyTransferService.bankMap.put("Beta", betaBank);
		
		AbstractAccount accountJohn = new SavingAccount(1, 1000);
        Client john = new Client("John", Gender.MALE);
        john.addAccount(accountJohn);
        alphaBank.addClient(john);
        
        AbstractAccount accountRichard = new SavingAccount(2, 1500);
		Client richard = new Client("Richard", Gender.MALE);
		richard.addAccount(accountRichard);
		betaBank.addClient(richard);
		
		System.out.println(accountJohn);
		System.out.println(accountRichard);
		
		MoneyTransferService.transferMoney("Alpha", 1, "Beta", 2, 200);
		
		System.out.println();
		System.out.println(accountJohn);
		System.out.println(accountRichard);
		
	}

}
