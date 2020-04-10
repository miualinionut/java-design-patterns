package com.design_patterns.mediator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client implements Serializable {

	private static final long serialVersionUID = 4067471219340550144L;
	
	private List<AbstractAccount> accounts = new ArrayList<AbstractAccount>();
	
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
	
	public List<AbstractAccount> getAccountsList() {
		return Collections.unmodifiableList(accounts);
	}
	
	public void addAccount(AbstractAccount account) {
		accounts.add(account);
	}

	@Override
	public String toString() {
		StringBuffer client = new StringBuffer(getSalutation());
		return client.toString();
	}
}
