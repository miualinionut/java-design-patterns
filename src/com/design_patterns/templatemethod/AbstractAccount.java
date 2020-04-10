package com.design_patterns.templatemethod;

public abstract class AbstractAccount {
	protected double balance;
	
	public AbstractAccount(double balance){
        this.balance = balance;
    }

	public double getBalance() {
		return balance;
	}

	public long decimalValue() {
		return Math.round(getBalance());
	}

	abstract double getMaxAmountToWithdraw();
	
	public final void withdraw(double value) throws NotEnoughFundsException {
        if (getMaxAmountToWithdraw() < value)
            throw new NotEnoughFundsException(value - getMaxAmountToWithdraw(),
                    "Not enough funds!");
        balance -= value;
        assert getMaxAmountToWithdraw() >= 0: "Not enough funds!";
    }
	
}
