package com.design_patterns.gof.behavioral.visitor;

public interface Account {
	void withdraw(double amount) throws NotEnoughFundsException;
	double getBalance();
	public void accept(ComponentVisitor componentVisitor);
}
