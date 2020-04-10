package com.design_patterns.gof.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class BankCommander {
	public static Bank currentBank = new Bank();
	public static Client currentClient;
	private static Map<String, Command> commands;

	static {
		commands = new HashMap<>();

		commands.put("find", new FindClientCommand());
		commands.put("get", new GetAccountCommand());
		commands.put("withdraw", new WithdrawCommand());
		commands.put("deposit", new DepositCommand());
		commands.put("transfer", new TransferCommand());
		commands.put("addClient", new AddClientCommand());
		commands.put("Exit", new Command() {
			public void execute() {
				printCommandInfo();
				System.exit(0);
			}

			public void printCommandInfo() {
				System.out.println("Exit");
			}
		});

	}

	public static void main(String args[]) {
		for (String commandName : commands.keySet()) {
			commands.get(commandName).execute();
		}
	}
}
