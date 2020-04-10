package com.design_patterns.gof.creational.abstractfactory;

public class SavingAlphaAccount extends AbstractAlphaAccount {
	public SavingAlphaAccount(double balance) {
        super(balance);
    }
	
	@Override
    public void verifyAccount(){
		System.out.format("Saving Alpha account, balance = %.2f%n", balance);
    }

}