package com.design_patterns.gof.behavioral.iterator;

public interface Account {
	void withdraw(double amount) throws NotEnoughFundsException;
	double getBalance();
}
