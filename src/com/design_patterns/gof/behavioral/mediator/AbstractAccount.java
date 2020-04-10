package com.design_patterns.gof.behavioral.mediator;

public abstract class AbstractAccount {
	private int id; 
	double balance;
        
    abstract void verifyAccount();
    abstract double maximumAmountToWithdraw();

    public AbstractAccount(int id, double balance){
    	this.id = id;
        this.balance = balance;
    }
    
    public int getId() { 
    	return id; 
    } 
    
    public void setId(int id) { 
    	this.id = id; 
    }
    
    public void deposit(final double amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot deposit a negative amount");
		}
		this.balance += amount;
	}

	public void withdraw(final double amount) throws NotEnoughFundsException {
		if (amount < 0) {
			throw new IllegalArgumentException("Cannot withdraw a negative amount");
		}
		
		if (amount > maximumAmountToWithdraw()) {
			throw new NotEnoughFundsException(id, balance, amount, "Requested amount exceeds the maximum amount to withdraw");
		}
		
		this.balance -= amount;
	}
    
    @Override
    public String toString(){
        return "Balance: " + (Math.round(balance * 100) / 100d);
    }
}