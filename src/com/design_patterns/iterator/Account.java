package com.design_patterns.iterator;

public interface Account {
	void withdraw (double amount) throws NotEnoughFundsException;
	double getBalance();
}
