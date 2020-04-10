package com.design_patterns.gof.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory newFactory(String choice){ 
		if(choice.equalsIgnoreCase("ALPHA")){ 
			return new AlphaAccountFactory(); 
		} 
		else if(choice.equalsIgnoreCase("BETA")){ 
			return new BetaAccountFactory(); 
		} 
		return null; 
	}
	
	public static void main(String[] args) { 
		AbstractFactory alphaAccountFactory = FactoryProducer.newFactory("ALPHA"); 
		AbstractAlphaAccount alphaAccount1 = alphaAccountFactory.newAlphaAccount("CHECKING");
		alphaAccount1.verifyAccount();
		AbstractAlphaAccount alphaAccount2 = alphaAccountFactory.newAlphaAccount("SAVING");
		alphaAccount2.verifyAccount();
		
		
        AbstractFactory betaAccountFactory = FactoryProducer.newFactory("BETA"); 
		AbstractBetaAccount betaAccount1 = betaAccountFactory.newBetaAccount("CHECKING");
		betaAccount1.verifyAccount();
		AbstractBetaAccount betaAccount2 = betaAccountFactory.newBetaAccount("SAVING");
		betaAccount2.verifyAccount();
	}

}
