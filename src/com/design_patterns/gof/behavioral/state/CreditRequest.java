package com.design_patterns.gof.behavioral.state;

public class CreditRequest {
	private CreditRequestState state;
	private double creditRate;
	private double clientSalary;

	public CreditRequest(double creditRate, double clientSalary){
		state = CreditRequestState.ANALYSIS;
		this.creditRate = creditRate;
		this.clientSalary = clientSalary;
	}

	public void setState(CreditRequestState state){
		this.state = state; 
	} 
	
	public CreditRequestState getState(){
		return state; 
	}
	
	public double getCreditRate() {
		return creditRate;
	}

	public void setCreditRate(double creditRate) {
		this.creditRate = creditRate;
	}

	public double getClientSalary() {
		return clientSalary;
	}

	public void setClientSalary(double clientSalary) {
		this.clientSalary = clientSalary;
	}
	
	public void printInfo(){
		state.printInfo(this);
	}

}
