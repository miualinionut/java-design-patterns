package com.design_patterns.gof.creational.singleton.staticfactory;

//Singleton with static factory
public class Bank {
	
	private static final Bank INSTANCE = new Bank();
	private Bank() {
		
	}

	public static Bank getInstance() { 
		return INSTANCE; 
	}
}

