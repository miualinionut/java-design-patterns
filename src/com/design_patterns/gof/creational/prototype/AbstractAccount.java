package com.design_patterns.gof.creational.prototype;

public abstract class AbstractAccount implements Cloneable {
	double balance;
        
    abstract void verifyAccount();

    public AbstractAccount(double balance){
        this.balance = balance;
    }
    
    public Object clone() { 
    	Object clone = null; 
    	try { 
    		clone = super.clone(); 
    	} catch (CloneNotSupportedException e) { 
    		e.printStackTrace(); 
    	} 
    	return clone; 
    }
}