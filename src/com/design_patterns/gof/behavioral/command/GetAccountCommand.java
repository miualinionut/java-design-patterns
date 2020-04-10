package com.design_patterns.gof.behavioral.command;

public class GetAccountCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Execute Get Account Command");
	}

	@Override
	public void printCommandInfo() {
		System.out.println("Get Account Command");
	}

}
