package com.design_patterns.abstractfactory;

public class CheckingBetaAccount extends AbstractBetaAccount {
	
	private double overdraft;

    public CheckingBetaAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = Math.abs(overdraft);
    }

    @Override
    public void verifyAccount(){
    	System.out.format("Checking Beta account, balance = %.2f overdraft = %.2f%n", balance, overdraft);
    }

}
