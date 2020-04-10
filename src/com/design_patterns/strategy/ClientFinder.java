package com.design_patterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class ClientFinder {
	
	public static List<Client> findClients(List<Client> inputList, Strategy strategy) {
		List<Client> resultClientsList = new ArrayList<Client>();
		
		for (Client client : inputList) {
			if (strategy.acceptClient(client)) {
				resultClientsList.add(client);
			}
		}
		
		return resultClientsList;
	}

}
