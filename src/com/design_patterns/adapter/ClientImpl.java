package com.design_patterns.adapter;

public class ClientImpl implements Client {
	private Nationality nationality;
	private Gender gender;
	private String surname;
	private String firstName;
	
	private ClientCustomerAdapter clientCustomerAdapter;
	
	public ClientImpl(Nationality nationality, Gender gender, String surname, String firstName) {
		this.nationality = nationality;
		this.gender = gender;
		this.surname = surname;
		this.firstName = firstName;
		
		if (nationality.equals(Nationality.FRENCH)) {
			clientCustomerAdapter = new ClientCustomerAdapter(new CustomerImpl(gender, surname, firstName));
		}
	}
	
	public String greet() {
		if (nationality.equals(Nationality.FRENCH)) {
			return clientCustomerAdapter.greet();
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ")
		  .append(gender.getSalute())
		  .append(" ")
		  .append(surname)
		  .append(", ")
		  .append(firstName);

		return sb.toString();
		
	}

}
