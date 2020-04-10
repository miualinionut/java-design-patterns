package com.design_patterns.gof.behavioral.chainofresponsibility;

public class HousingPropertySpecialist extends AbstractSpecialist {
	
	@Override 
	protected boolean makeDecision(double creditRate, double clientSalary, boolean propertyGuarantee) {
		if (null != this.nextSpecialist && propertyGuarantee) {
			System.out.format("Approved at the %s level, passing to next specialist%n", this.getClass().getSimpleName());
			return this.nextSpecialist.makeDecision(creditRate, clientSalary, propertyGuarantee);
		}
		
		printFinalDecision(propertyGuarantee);
		
		return propertyGuarantee;
	}

}
