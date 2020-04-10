package com.design_patterns.abstractfactory;

public class CheckingAlphaAccount extends AbstractAlphaAccount {
	private double overdraft;

    public CheckingAlphaAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = Math.abs(overdraft);
    }

    @Override
    public void verifyAccount(){
    	System.out.format("Checking Alpha account, balance = %.2f overdraft = %.2f%n", balance, overdraft);
    }
}