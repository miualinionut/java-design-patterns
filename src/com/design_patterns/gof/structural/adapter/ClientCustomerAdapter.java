package com.design_patterns.gof.structural.adapter;

public class ClientCustomerAdapter implements Client {
	
	private Customer customer;
	
	public ClientCustomerAdapter(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String greet() {
		return customer.salut();
	}

}
