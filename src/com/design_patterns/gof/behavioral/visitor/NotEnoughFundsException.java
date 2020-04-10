package com.design_patterns.gof.behavioral.visitor;

public class NotEnoughFundsException extends Exception {

	private static final long serialVersionUID = 3157911520545846287L;
	private double amount;

    public NotEnoughFundsException(double amount, String message) {
        super(message);
        this.amount = Math.round(amount * 100) / 100d;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString(){
        return getMessage() + " Maximum withdraw exceeded with: " + amount;
    }
}