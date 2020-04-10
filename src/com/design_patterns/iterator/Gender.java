package com.design_patterns.iterator;

public enum Gender {
	MALE("Mr."), FEMALE("Ms.");

	private String salut;

	private Gender(final String salut) {
		this.salut = salut;
	}

	public String getSalutation() {
		return salut;
	}
}
