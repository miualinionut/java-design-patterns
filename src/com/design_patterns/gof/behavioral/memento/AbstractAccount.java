package com.design_patterns.gof.behavioral.memento;

import com.design_patterns.gof.behavioral.mediator.NotEnoughFundsException;


public abstract class AbstractAccount implements Cloneable {
	private int id; 
	double balance;
        
    abstract void verifyAccount();
    abstract double maximumAmountToWithdraw();

    public AbstractAccount(double balance){
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
	public AbstractAccount clone() {
		AbstractAccount account = null;
		
		try {
			account = (AbstractAccount) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return account;
		
	}
}