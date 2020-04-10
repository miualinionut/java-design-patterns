package com.design_patterns.mediator;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class MoneyTransferService {
	
	public static Map<String, Bank> bankMap = new HashMap<String, Bank>();
	
	public static void transferMoney(String fromBankName, int fromAccountId, String toBankName, int toAccountId, double sum) throws NotEnoughFundsException{ 
		Bank fromBank = bankMap.get(fromBankName);
		Collection<AbstractAccount> fromAccountsList = fromBank.getAccounts();
		for (AbstractAccount account : fromAccountsList) {
			if (account.getId() == fromAccountId) {
				account.withdraw(sum);
				System.out.format("Withdraw the sum of %.2f into the account %d%n", sum, fromAccountId);
			}
		}
		
		Bank toBank = bankMap.get(toBankName);
		Collection<AbstractAccount> toAccountsList = toBank.getAccounts();
		for (AbstractAccount account : toAccountsList) {
			if (account.getId() == toAccountId) {
				account.deposit(sum);
				System.out.format("Deposited the sum of %.2f into the account %d%n", sum, toAccountId);
			}
		}
	}

}
