package com.design_patterns.visitor;

public class SimpleVisitor implements ComponentVisitor {
	
	@Override
	public void visit(Bank bank) {
		System.out.println("Inspecting bank: ");
	}
	
	@Override
	public void visit(Client client) {
		System.out.println("Inspecting client: " + client.getName());
	}
	
	@Override
	public void visit(Account account) {
		if (account instanceof SavingAccount) {
			SavingAccount savingAccount = (SavingAccount) account;
			if (savingAccount.getBalance() < 0) {
			   System.out.format("Visiting Saving Account, balance = %.2f%n", savingAccount.getBalance());
			}
		} else if (account instanceof CheckingAccount) {
			CheckingAccount checkingAccount = (CheckingAccount) account;
			if (checkingAccount.getBalance() < 0) {
			   System.out.format("Visiting Checking Account, balance = %.2f, overdraft = %.2f%n", checkingAccount.getBalance(), checkingAccount.getOverdraft());
			}
		} else {
			System.out.format("Visiting account, balance = %.2f%n", account.getBalance());
		}

	}
}
