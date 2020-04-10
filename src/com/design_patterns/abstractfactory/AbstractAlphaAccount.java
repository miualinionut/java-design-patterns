package com.design_patterns.abstractfactory;

abstract public class AbstractAlphaAccount {
	private String id; 

	double balance;
        
    abstract void verifyAccount();

    public AbstractAlphaAccount(double balance){
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