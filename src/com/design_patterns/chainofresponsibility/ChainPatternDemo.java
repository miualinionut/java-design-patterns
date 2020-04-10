package com.design_patterns.chainofresponsibility;

public class ChainPatternDemo {
	
	private static AbstractSpecialist getChainOfSpecialists(){ 
		
		AbstractSpecialist financialSpecialist = new FinancialSpecialist(); 
		AbstractSpecialist housingPropertySpecialist = new HousingPropertySpecialist();
		
		financialSpecialist.setNextSpecialist(housingPropertySpecialist); 
		
		return financialSpecialist; 
	}
	
	public static void main(String[] args) { 
		AbstractSpecialist specialistsChain = getChainOfSpecialists();
		specialistsChain.makeDecision(1000.00, 2600.00, true);
		System.out.println();
		specialistsChain.makeDecision(1000.00, 3600.00, false);
		System.out.println();
		specialistsChain.makeDecision(1000.00, 3600.00, true);
	}

}
