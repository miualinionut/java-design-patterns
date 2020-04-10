package com.design_patterns.gof.behavioral.memento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AccountHistory {
	
	private List<AccountMemento> accountMementoList = new ArrayList<AccountMemento>();
	
	public List<AccountMemento> getAccountMementoList() {
		return Collections.unmodifiableList(accountMementoList);
	}
	
	public AccountMemento createMemento(Date date, AbstractAccount account){
		return new AccountMemento(date, account.clone());
	}

	public void saveMemento(AccountMemento accountMemento) {
		accountMementoList.add(accountMemento); 
	} 
}
