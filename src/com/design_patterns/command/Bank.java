package com.design_patterns.command;

import java.util.HashSet;
import java.util.Set;

public class Bank {

	private Set<Client> clients = new HashSet<>();

	public void addClient(Client client) {
    	if (!clients.contains(client)) {
    		clients.add(client);
    	} 
    }
    
}