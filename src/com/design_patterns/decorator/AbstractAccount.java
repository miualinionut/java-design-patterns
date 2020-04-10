package com.design_patterns.decorator;

public abstract class AbstractAccount {
	double balance;
        
    abstract void verifyAccount();

    public AbstractAccount(double balance){
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return "Balance: " + (Math.round(balance * 100) / 100d);
    }
}