package com.design_patterns.gof.behavioral.visitor;

public class CheckingAccount extends AbstractAccount {
	private double overdraft;

    public double getOverdraft() {
		return overdraft;
	}

	public CheckingAccount(double balance, double overdraft) {
        super(balance);
        this.overdraft = Math.abs(overdraft);
    }

	@Override
	double getMaxAmountToWithdraw() {
		return balance + overdraft;
	}
}