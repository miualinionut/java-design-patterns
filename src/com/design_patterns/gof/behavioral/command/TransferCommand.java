package com.design_patterns.gof.behavioral.command;

public class TransferCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Execute Transfer Command");
	}

	@Override
	public void printCommandInfo() {
		System.out.println("Transfer Command");	
	}

}
