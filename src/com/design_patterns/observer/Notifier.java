package com.design_patterns.observer;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public abstract class Notifier<T> implements Serializable {

	private static final long serialVersionUID = -8616327045006117857L;
	private List<EventNotificationListener<Client>> listeners = new LinkedList<>();

    public void registerListener(EventNotificationListener<Client> listener){
        listeners.add(listener);
    }

    protected void notify(Client client){
        for (EventNotificationListener<Client> listener: listeners)
            listener.onClientAdded(client);
    }
}