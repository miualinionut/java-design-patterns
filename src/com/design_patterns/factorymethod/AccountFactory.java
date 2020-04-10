package com.design_patterns.factorymethod;

public class AccountFactory {

	public static AbstractAccount newAccount(String accountType) {
		if (accountType == null) {
			throw new IllegalArgumentException("Null argument received.");
		}

		switch (accountType.toUpperCase()) {
			case "CHECKING":
				return new CheckingAccount(0.0, 0.0);
			case "SAVING":
				return new SavingAccount(0.0);
		}

		throw new IllegalArgumentException("Unknown account type.");

	}

	public static void main(String[] args) {
		// get an object of CheckingAccount
		AbstractAccount account1 = AccountFactory.newAccount("CHECKING");
		System.out.println(account1.getClass().getSimpleName());

		// get an object of SavingAccount
		AbstractAccount account2 = AccountFactory.newAccount("SAVING");
		System.out.println(account2.getClass().getSimpleName());

	}

}
