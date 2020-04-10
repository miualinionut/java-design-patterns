package com.design_patterns.gof.behavioral.chainofresponsibility;

public abstract class AbstractSpecialist {
	
	//next element in chain or responsibility 
	protected AbstractSpecialist nextSpecialist;
	
	public void setNextSpecialist(AbstractSpecialist nextSpecialist){
		this.nextSpecialist = nextSpecialist; 
	} 
	
	public void printFinalDecision(boolean decision) {
		if (decision) {
        	System.out.format("Final approval at the %s level%n", this.getClass().getSimpleName());
		} else {
			System.out.format("Rejected at the %s level%n", this.getClass().getSimpleName());
		}
	}
	
	abstract protected boolean makeDecision(double creditRate, double clientSalary, boolean propertyGuarantee);
}
