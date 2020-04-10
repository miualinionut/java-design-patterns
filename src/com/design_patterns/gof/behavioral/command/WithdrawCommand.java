package com.design_patterns.gof.behavioral.command;

public class WithdrawCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Execute Withdraw Command");
	}

	@Override
	public void printCommandInfo() {
		System.out.println("Withdraw Command");	
	}

}
