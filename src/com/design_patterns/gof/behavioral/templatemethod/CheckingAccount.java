package com.design_patterns.gof.behavioral.templatemethod;

import java.util.Formatter;
import java.util.Locale;


public class CheckingAccount extends AbstractAccount {

	private double overdraft;

	public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = Math.abs(overdraft);
    }

	public double getOverdraft() {
		return overdraft;
	}
	
	public double getMaxAmountToWithdraw(){
        return getBalance() + overdraft;
    }
	
	public String toString() {
		@SuppressWarnings("resource")
		Formatter formatter = new Formatter(Locale.US);
		
		return formatter.format("Balance = %.2f overdraft = %.2f%n", balance, overdraft).toString();
	}
	
}
