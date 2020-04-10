package com.design_patterns.strategy;

import java.io.Serializable;

public class Client implements Serializable {

	private static final long serialVersionUID = 4067471219340550144L;
	
	private String name;
	private Gender gender;

	public Client(final String name, final Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public String getSalutation() {
		if (gender != null) {
			return gender.getSalute() + " " + name;
		} else {
			return name;
		}
	}
	
	@Override
	public String toString() {
		StringBuffer client = new StringBuffer(getSalutation());
		return client.toString();
	}
}
