package com.design_patterns.gof.creational.factory.abstractfactory;

public class BetaAccountFactory extends AbstractFactory {
	
	@Override
	public AbstractBetaAccount newBetaAccount(String accountType) {
		if(accountType == null) {
			return null;
		}
		
		if(accountType.equalsIgnoreCase("CHECKING")){ 
			return new CheckingBetaAccount(0.0, 0.0); 
		} 
		else if(accountType.equalsIgnoreCase("SAVING")){ 
			return new SavingBetaAccount(0.0); 
		} 
		
		return null;
	}

}
