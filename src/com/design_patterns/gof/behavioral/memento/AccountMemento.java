package com.design_patterns.gof.behavioral.memento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AccountMemento {
	private Date date;
	private AbstractAccount account;
	
	public AccountMemento( Date date, AbstractAccount account) {
		this.date = date;
		this.account = account;
	}
	
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date) + " " + account;
	}

}
