package com.design_patterns.flyweight;

public abstract class AbstractCreditOffer {
    private String type;
	abstract void verifyOffer();

	public String getType(){ 
    	return type; 
    }
    
    public void setType(String type) {
		this.type = type;
	}
 }