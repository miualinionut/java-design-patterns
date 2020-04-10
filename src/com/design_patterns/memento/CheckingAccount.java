package com.design_patterns.memento;

import java.util.Formatter;
import java.util.Locale;

public class CheckingAccount extends AbstractAccount {
	private double overdraft;

    public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = Math.abs(overdraft);
    }

    @Override
    public void verifyAccount(){
    	System.out.format("Checking account, balance = %.2f overdraft = %.2f%n", balance, overdraft);
    }

	@Override
	double maximumAmountToWithdraw() {
		return balance + overdraft;
	}
	
	 @Override
	 public String toString(){
		 @SuppressWarnings("resource")
	     Formatter formatter = new Formatter(Locale.US);
			
		return formatter.format("Balance = %.2f overdraft = %.2f%n", balance, overdraft).toString();
	 }
}