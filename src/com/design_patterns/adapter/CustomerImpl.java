package com.design_patterns.adapter;

public class CustomerImpl implements Customer {

	private Gender gender;
	private String surname;
	private String firstName;
	
	public CustomerImpl(Gender gender, String surname, String firstName) {
		this.gender = gender;
		this.surname = surname;
		this.firstName = firstName;
	}
	
	private String getFrenchSalutation() {
		if (gender.equals(Gender.MALE)) {
			return "Monsieur";
		}
		
		if (gender.equals(Gender.FEMALE)) {
			return "Madame";
		}
		
		return "";
	}
	
	public String salut() {
		StringBuilder sb = new StringBuilder();
		sb.append("Bonjour, ")
		  .append(getFrenchSalutation())
		  .append(" ")
		  .append(firstName)
		  .append(" ")
		  .append(surname);
		
		return sb.toString();
		
	}

}
