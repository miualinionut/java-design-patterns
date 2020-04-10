package com.design_patterns.mediator;

public class SavingAccount extends AbstractAccount {
	public SavingAccount(int id, double balance) {
        super(id, balance);
    }
	
	@Override
    public void verifyAccount(){
		System.out.format("Saving account, balance = %.2f%n", balance);
    }

	@Override
	double maximumAmountToWithdraw() {
		return balance;
	}

}