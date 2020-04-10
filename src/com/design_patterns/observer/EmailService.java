package com.design_patterns.observer;

import java.io.Serializable;

public class EmailService extends Thread implements Serializable {

	private static final long serialVersionUID = -4105959094525847677L;
	private static Queue queue = new Queue();
    private static boolean closed;

    public static void startService() {
    	new EmailService().start();
    }
    
    @Override
    public void run() {
        Email email;
        while (true) {
            if ((email = queue.get()) != null)
                sendEmail(email);
            try {
            	synchronized(queue) {
            		queue.wait();
            	}
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    private void sendEmail(Email email) {
        System.out.println(email);
    }

    public static void sendNotificationEmail(Email email) throws EmailException {
        if (!closed) {
            queue.add(email);
        	synchronized(queue) {
        		queue.notify();
        	}
        } else
            throw new EmailException("Mailbox is closed!");
    }

    public static void close(){
        closed = true;
    }
}