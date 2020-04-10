package com.design_patterns.solid.single_responsibility_principle.good_example;

// single responsibility principle - good example
interface Email {
	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(Content content);
}

interface Content {
	public String getAsString(); // used for serialization
}

class EmailImpl implements Email {
	public void setSender(String sender) { }
	public void setReceiver(String receiver) {}
	public void setContent(Content content) {}
}