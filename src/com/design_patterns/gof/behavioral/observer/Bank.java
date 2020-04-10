package com.design_patterns.gof.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Bank extends Notifier<Client> {

	private static final long serialVersionUID = -8938581039910386259L;
	private Set<Client> clients = new HashSet<>();
	private Client admin = new Client("admin", Gender.MALE),
                   system = new Client("system", Gender.MALE);
	
    public void addClient(Client client) {
    	if (!clients.contains(client)) {
    		clients.add(client);
    		notify(client);
    	} 
    }
    
	class PrintClientListener implements EventNotificationListener<Client> {
        
		private static final long serialVersionUID = 3488610450673019474L;

		@Override 
		public void onClientAdded(Client client) {
            System.out.println("Client added: " + client);
        }
    }

	class EmailNotificationListener implements EventNotificationListener<Client> {

		private static final long serialVersionUID = -6779518077620856524L;

		@Override 
		public void onClientAdded(Client client) {
            try {
            	System.out.println("Send e-mail notification to " + client.getName());
                EmailService.sendNotificationEmail(
                        new Email()
                                .setFrom(system)
                                .setTo(admin)
                                .setCopy(client)
                                .setTitle("Client Added Notification")
                                .setBody("Client added: " + client)
                );
            } catch (EmailException e) {
                System.err.println(e.getMessage());
            }
        }
    }
	
    

}