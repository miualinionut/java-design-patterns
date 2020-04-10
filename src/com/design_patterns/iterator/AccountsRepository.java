package com.design_patterns.iterator;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class AccountsRepository implements Container {
	
	private List<Client> clients;
	
	public AccountsRepository(Bank bank) {
		clients =  new ArrayList<Client>(bank.getClients());
	}
	
	
	public List<Client> getClients() {
		return clients;
	}

	@Override public Iterator getIterator() { 
		return new AccountIterator(); 
	} 
	
	private class AccountIterator implements Iterator { 
		int currentClientIndex = 0;
		int currentClientAccountIndex = 0;
		
		@Override 
		public boolean hasNext() {
			if (currentClientIndex >= clients.size()) {
				return false;
			}
			
			int clientIndex = currentClientIndex;
			Client currentClient = clients.get(clientIndex++);
			
			if (currentClientAccountIndex < currentClient.getAccountsList().size()) {
				return true;
			}
			
			while (clientIndex < clients.size()) {
				currentClient = clients.get(clientIndex++);
				if (!currentClient.getAccountsList().isEmpty())
					return true;
			}
			
			return false;
		} 
		
		@Override public Object next() { 
			if (!hasNext()) {
				return null;
			}
			
			Client currentClient = clients.get(currentClientIndex);
			
			System.out.println("Account owner: " + currentClient.getName());
			
			if (currentClientAccountIndex < currentClient.getAccountsList().size()-1) {
				return currentClient.getAccountsList().get(currentClientAccountIndex++);
			} else {
				Object account = currentClient.getAccountsList().get(currentClientAccountIndex);
				currentClientIndex++;
				currentClientAccountIndex = 0;	
				return account;
			}
			
				
		}
		
	}

}
