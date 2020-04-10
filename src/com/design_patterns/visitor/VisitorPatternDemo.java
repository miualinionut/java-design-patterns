package com.design_patterns.visitor;

public class VisitorPatternDemo {
	private static double totalBankBalance = 0;

	public static void main(String[] args) { 
		Bank bank = new Bank();
		
		Client john = new Client("John", Gender.MALE);
		john.addAccount(new SavingAccount(1000));
		
		Client richard = new Client("Richard", Gender.MALE);
		richard.addAccount(new SavingAccount(-150));
		
		Client laura = new Client("Laura", Gender.FEMALE);
		laura.addAccount(new SavingAccount(200));
		laura.addAccount(new CheckingAccount(-500, 200));
		
		bank.addClient(john);
		bank.addClient(richard);
		bank.addClient(laura);
		
		bank.accept(new SimpleVisitor());
		
		bank.accept(new SimpleVisitor() {
			
			@Override
			public void visit(Account acc) {
				totalBankBalance += acc.getBalance();
			}

		});
		
		System.out.format("Total bank balance = %.2f", totalBankBalance);
		
	}

}

