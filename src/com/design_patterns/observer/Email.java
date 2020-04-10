package com.design_patterns.observer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Email implements Serializable {

	private static final long serialVersionUID = -3686472195559526951L;
	private Client from;
    private List<Client> to, copy;
    private String title, body;

    public Client getFrom() {
        return from;
    }

    public Email setFrom(Client from) {
        this.from = from;
        return this;
    }

    public List<Client> getTo() {
        return to;
    }

    public Email setTo(List<Client> to) {
        this.to = to;
        return this;
    }

    public Email setTo(Client to) {
    	List<Client> toList = new ArrayList<Client>();
    	toList.add(to);
        setTo(toList);
        return this;
    }

    public List<Client> getCopy() {
        return copy;
    }

    public Email setCopy(List<Client> copy) {
        this.copy = copy;
        return this;
    }

    public Email setCopy(Client copy) {
    	List<Client> copyList = new ArrayList<Client>();
    	copyList.add(copy);
        setCopy(copyList);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Email setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Email setBody(String body) {
        this.body = body;
        return this;
    }
    
}