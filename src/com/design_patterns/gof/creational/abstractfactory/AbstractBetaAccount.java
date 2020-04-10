package com.design_patterns.gof.creational.abstractfactory;

public abstract class AbstractBetaAccount {
	private String id; 

	double balance;
        
    abstract void verifyAccount();

    public AbstractBetaAccount(double balance){
        this.balance = balance;
    }
    
    public String getId() { 
    	return id; 
    } 
    
    public void setId(String id) { 
    	this.id = id; 
    }
    
    @Override
    public String toString(){
        return "Balance: " + (Math.round(balance * 100) / 100d);
    }

}
