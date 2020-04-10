package com.design_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class OfferFactory {
	private static final Map<String, AbstractCreditOffer> creditOfferMap = new HashMap<>(); 
	
	public static AbstractCreditOffer getCreditOffer(String type) { 
		CreditOffer creditOffer = (CreditOffer)creditOfferMap.get(type); 
		if (creditOffer == null) { 
			creditOffer = new CreditOffer(); 
			creditOffer.setType(type);
			creditOfferMap.put(type, creditOffer); 
			System.out.println("Creating credit offer of type: " + type); 
		} 
		return creditOffer; 
	}
	
}
