package com.design_patterns.visitor;

public abstract class AbstractAccount implements Account {

	protected double balance;

	public AbstractAccount(double balance){
        this.balance = balance;
    }

	public double getBalance() {
		return balance;
	}

	abstract double getMaxAmountToWithdraw();
	
	public final void withdraw(double value) throws NotEnoughFundsException {
        if (getMaxAmountToWithdraw() < value)
            throw new NotEnoughFundsException(value - getMaxAmountToWithdraw(),
                    "Not enough funds!");
        balance -= value;
        assert getMaxAmountToWithdraw() >= 0: "Not enough funds!";
    }
	
	public void accept(ComponentVisitor componentVisitor){
		componentVisitor.visit(this);
	}
	
}
