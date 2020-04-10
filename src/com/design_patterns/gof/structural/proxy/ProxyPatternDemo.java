package com.design_patterns.gof.structural.proxy;

public class ProxyPatternDemo {
	
	public static void main(String[] args) { 
		SecureSavingAccount secureSavingAccount = new SecureSavingAccount();
		//will require rights to access the saving account 
		secureSavingAccount.verifyAccount();
		System.out.println(""); 
		//rights will no longer be required  
		secureSavingAccount.verifyAccount();
	}

}
