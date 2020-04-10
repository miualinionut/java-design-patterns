package com.design_patterns.builder;

import java.util.Date;

public class Customer {
	private Gender gender;
	private String surname;
	private String firstName;
	private String middleName;
	@SuppressWarnings("unused")
	private Date birthday;
	private Date becomeCustomer;
	
	public static class Builder {
		// Required parameters
		private Gender gender;
		private String surname;
		private String firstName;
		
		// Optional parameters
		private String middleName;
		private Date birthday;
		private Date becomeCustomer;
		
		public Builder(Gender gender, String surname, String firstName) {
			this.gender = gender;
			this.surname = surname;
			this.firstName = firstName;
		}
		
		public Builder middleName(String val) { 
		  middleName = val; 
		  return this; 
		}
		
		public Builder birthday(Date val)	{ 
			birthday = val; 
			return this; 
		}
		
		public Builder becomeCustomer(Date val)	{ 
			becomeCustomer = val; 
			return this; 
		}
		
		public Customer build() {
			return new Customer(this);
		}
	}
	
	private Customer(Builder builder) {
		this.gender = builder.gender;
		this.surname = builder.surname;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.birthday = builder.birthday;
		this.becomeCustomer = builder.becomeCustomer;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(gender.getSalute())
		  .append(" ")
		  .append(surname)
		  .append(" ");
		if(middleName != null) {
			sb.append(middleName)
			  .append(" ");
		}
		sb.append(firstName);
		if (null != becomeCustomer) {
			sb.append(" has become a customer on: ")
			  .append(becomeCustomer);
		}
		return sb.toString();
	}
	
	public static void main (String[] args) {
		Customer firstClient = new Customer.Builder(Gender.MALE, "Smith", "John")
				                           .middleName("H.")
				                           .becomeCustomer(new Date())
				                           .build();
		System.out.println(firstClient);
	}

}
