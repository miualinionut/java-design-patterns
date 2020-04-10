package com.design_patterns.decorator;

public class SmsManageableAccountDecorator extends AbstractAccountDecorator {

	public SmsManageableAccountDecorator(AbstractAccount decoratedAccount) {
		super(decoratedAccount);
	}
	
	@Override
	public void verifyAccount(){ 
		sendSmsToCustomer();
		decoratedAccount.verifyAccount(); 
	}
	
	private void sendSmsToCustomer() {
		System.out.println("Send SMS to customer: verifying your account");
	}

}
