package com.design_patterns.gof.behavioral.iterator;

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
