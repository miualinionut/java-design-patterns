package com.design_patterns.abstractfactory;

public class SavingBetaAccount extends AbstractBetaAccount {
	public SavingBetaAccount(double balance) {
        super(balance);
    }
	
	@Override
    public void verifyAccount(){
		System.out.format("Saving Beta account, balance = %.2f%n", balance);
    }

}
