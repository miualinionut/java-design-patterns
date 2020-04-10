package com.design_patterns.gof.behavioral.command;

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
