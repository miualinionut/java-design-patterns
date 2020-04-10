package com.design_patterns.observer;

public class ObserverPatternDemo {
	
	public static void main(String[] args) { 
		Bank bank = new Bank();
		bank.registerListener(bank.new PrintClientListener());
		bank.registerListener(bank.new EmailNotificationListener());
    	Client john = new Client("John", Gender.MALE);
    	bank.addClient(john);
	}

}
