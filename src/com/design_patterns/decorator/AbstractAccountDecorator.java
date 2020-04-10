package com.design_patterns.decorator;

public abstract class AbstractAccountDecorator extends AbstractAccount {
	
	AbstractAccount decoratedAccount; 
	
	public AbstractAccountDecorator(AbstractAccount decoratedAccount) { 
		super(decoratedAccount.balance);
		this.decoratedAccount = decoratedAccount; 
	} 
	
	public void verifyAccount() { 
		decoratedAccount.verifyAccount(); 
	}

}
