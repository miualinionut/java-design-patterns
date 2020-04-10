package com.design_patterns.state;

public class StatePatternDemo {
	public static void main(String[] args) { 
		CreditRequest creditRequest = new CreditRequest(1000.00, 5000.00); 
		
		creditRequest.printInfo();
		creditRequest.printInfo();
	}
}
