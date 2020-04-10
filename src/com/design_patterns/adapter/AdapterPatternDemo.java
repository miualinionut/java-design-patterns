package com.design_patterns.adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) { 
		ClientImpl client = new ClientImpl(Nationality.ENGLISH, Gender.MALE, "Smith", "John");
		System.out.println(client.greet());
		
		ClientImpl frenchMaleCustomer = new ClientImpl(Nationality.FRENCH, Gender.MALE, "Durand", "Michel");
		System.out.println(frenchMaleCustomer.greet());
		
		ClientImpl frenchFemaleCustomer = new ClientImpl(Nationality.FRENCH, Gender.FEMALE, "Durand", "Danielle");
		System.out.println(frenchFemaleCustomer.greet());
		
	}

}
