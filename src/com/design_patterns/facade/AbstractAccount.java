package com.design_patterns.facade;


public abstract class AbstractAccount {
	double balance;
        
    abstract void verifyAccount();
    abstract double maximumAmountToWithdraw();
    
    public void withdraw(final double amount) throws NotEnoughFundsException {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		
		if (amount > maximumAmountToWithdraw()) {
			throw new NotEnoughFundsException(balance, amount, "Requested amount exceeds the maximum amount to withdraw");
		}
		
		this.balance -= amount;
	}
    
    public void deposit(final double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

    public AbstractAccount(double balance){
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return "Balance: " + (Math.round(balance * 100) / 100d);
    }
}