package com.design_patterns.proxy;

public class SavingAccount implements Account {
	private double balance;

	public SavingAccount(double balance) {
        this.balance = Math.abs(balance);
        provideSecureAccessRights();
    }

    @Override
    public double getBalance() {
    	return balance;
    }
    
    @Override
    public void verifyAccount(){
    	System.out.format("Saving account, balance = %.2f%n", balance);
    }
    
    private void provideSecureAccessRights() {
    	System.out.println("Provide rights for secure access of the saving account");
    }

	
}