package com.design_patterns.gof.behavioral.memento;

import com.design_patterns.gof.behavioral.mediator.NotEnoughFundsException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MementoPatternDemo {
	
	public static void main(String[] args) throws NotEnoughFundsException {
		CheckingAccount checkingAccount = new CheckingAccount(1000.00, 200.00);
		Calendar calendar = new GregorianCalendar(2015, 1, 1);

		AccountHistory accountHistory = new AccountHistory();
		
		AccountMemento accountMemento1 = accountHistory.createMemento(calendar.getTime(), checkingAccount);
		accountHistory.saveMemento(accountMemento1);
		
		checkingAccount.withdraw(100.00);
		calendar = new GregorianCalendar(2015, 2, 1);
		AccountMemento accountMemento2 = accountHistory.createMemento(calendar.getTime(), checkingAccount);
		accountHistory.saveMemento(accountMemento2);
		
		for (AccountMemento currentAccountMemento : accountHistory.getAccountMementoList()) {
			System.out.format("Account state: %s%n", currentAccountMemento); 
		}
	}

}
