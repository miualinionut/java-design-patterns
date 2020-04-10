package com.design_patterns.gof.behavioral.mediator;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bank {

	private Set<Client> clients = new HashSet<>();

    public Client getClient(String name) {
        for (Client client: clients)
            if (client.getName().equals(name))
                return client;
        return null;
    }

    public Collection<AbstractAccount> getAccounts() {
        Collection<AbstractAccount> result = new HashSet<>();
        for (Client client: clients)
            result.addAll(client.getAccountsList());
        return result;
    }

    public Set<Client> getClients(){
        return Collections.unmodifiableSet(clients);
    }

    public void addClient(Client client) {
    	// add account if client is already exist
    	Collection<AbstractAccount> accounts = client.getAccountsList();
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
    
}