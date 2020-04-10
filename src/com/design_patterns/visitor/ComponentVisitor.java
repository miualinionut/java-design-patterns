package com.design_patterns.visitor;

public interface ComponentVisitor {
	
	public void visit(Bank bank); 
	public void visit(Client client); 
	public void visit(Account account); 

}
