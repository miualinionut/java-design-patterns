package com.design_patterns.single_responsibility_principle.bad_example;

// single responsibility principle - bad example
interface Email {
	public void setSender(String sender);
	public void setReceiver(String receiver);
	public void setContent(String content);
}

class EmailImpl implements Email {
	public void setSender(String sender) { }
	public void setReceiver(String receiver) {}
	public void setContent(String content) {}
}