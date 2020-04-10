package com.design_patterns.command;

public enum Gender {
	MALE("Mr."), FEMALE("Ms.");

	private String salut;

	private Gender(final String salut) {
		this.salut = salut;
	}

	public String getSalute() {
		return salut;
	}
}
