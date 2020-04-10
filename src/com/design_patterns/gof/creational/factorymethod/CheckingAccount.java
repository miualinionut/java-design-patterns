package com.design_patterns.gof.creational.factorymethod;

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
}