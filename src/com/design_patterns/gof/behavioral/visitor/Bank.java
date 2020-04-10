package com.design_patterns.gof.behavioral.visitor;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bank {

	private Set<Client> clients = new HashSet<>();

    public Set<Client> getClients(){
        return Collections.unmodifiableSet(clients);
    }

    public void addClient(Client client) {
    	// add account if client is already exist
    	Collection<Account> accounts = client.getAccountsList();
    	if (accounts!=null && clients.contains(client)) {
    		for (Client baseClient: clients) {
    			if (client.equals(baseClient)) {
    				baseClient.getAccountsList().addAll(accounts);
    			}
    		}
    	} else {
    		clients.add(client);
    	}
    }
    
    public void accept(ComponentVisitor componentVisitor){
		componentVisitor.visit(this); 
		for (Client client : getClients()) {
			client.accept(componentVisitor); 
		} 
	}

}