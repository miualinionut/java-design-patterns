package com.design_patterns.gof.creational.factory.abstractfactory;

public class AlphaAccountFactory extends AbstractFactory {
	
	@Override
	public AbstractAlphaAccount newAlphaAccount(String accountType) {
		if(accountType == null) {
			return null;
		}
		
		if(accountType.equalsIgnoreCase("CHECKING")){ 
			return new CheckingAlphaAccount(0.0, 0.0); 
		} 
		else if(accountType.equalsIgnoreCase("SAVING")){ 
			return new SavingAlphaAccount(0.0); 
		} 
		
		return null;
	}

}
