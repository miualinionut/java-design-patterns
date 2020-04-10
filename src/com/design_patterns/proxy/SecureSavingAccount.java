package com.design_patterns.proxy;

public class SecureSavingAccount implements Account {
	
	private SavingAccount savingAccount;

	@Override
	public void verifyAccount() {
		if (null == savingAccount) {
			savingAccount = new SavingAccount(1000.0);
		}
		savingAccount.verifyAccount();
	}

	@Override
	public double getBalance() {
		if (null == savingAccount) {
			return 0.0;
		}
		return savingAccount.getBalance();
	}

}
