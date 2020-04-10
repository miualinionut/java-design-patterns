package com.design_patterns.iterator;

public class IteratorPatternDemo {
	
	public static void main(String[] args) { 
		
		Bank bank = new Bank();
		
		Client john = new Client("John", Gender.MALE);
		john.addAccount(new SavingAccount(1000));
		bank.addClient(john);
		
		Client richard = new Client("Richard", Gender.MALE);
		richard.addAccount(new SavingAccount(-150));
		bank.addClient(richard);
		
		Client laura = new Client("Laura", Gender.FEMALE);
		laura.addAccount(new SavingAccount(-200));
		laura.addAccount(new SavingAccount(1500));
		bank.addClient(laura);
		
		AccountsRepository accountsRepository = new AccountsRepository(bank);
		
		for(Iterator iter = accountsRepository.getIterator(); iter.hasNext();)
		{ 
			Account account = (Account)iter.next();
			System.out.print(account);
			
			if (account.getBalance() < 0) {
				System.out.println("Found first account with negative balance. Calling the owner.");
				break;
			}
			 
		} 
	}

}
