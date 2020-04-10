package com.design_patterns.command;

public class DepositCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Execute Deposit Command");
	}

	@Override
	public void printCommandInfo() {
		System.out.println("Deposit Command");	
	}

}
