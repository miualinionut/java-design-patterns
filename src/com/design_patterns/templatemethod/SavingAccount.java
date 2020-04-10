package com.design_patterns.templatemethod;

import java.util.Formatter;
import java.util.Locale;

public class SavingAccount extends AbstractAccount {

	public SavingAccount(double balance) {
        super(balance);
    }

	public double getMaxAmountToWithdraw(){
        return getBalance();
    }
	
	public String toString(){
		@SuppressWarnings("resource")
		Formatter formatter = new Formatter(Locale.US);
		
		return formatter.format("Balance = %.2f%n", balance).toString();
	}
}
