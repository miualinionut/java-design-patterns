package com.design_patterns.state;

public enum CreditRequestState {
	ANALYSIS  {
		public void printInfo(CreditRequest creditRequest) {
			System.out.println("Credit request is in analysis state"); 
			if (creditRequest.getCreditRate() < creditRequest.getClientSalary()/3) {
			   creditRequest.setState(ACCEPTED);
			} else {
			   creditRequest.setState(REJECTED);
			}
		}
	}, ACCEPTED {
		public void printInfo(CreditRequest creditRequest) {
			System.out.println("Credit request is in accepted state"); 
		}
	}, REJECTED {
		public void printInfo(CreditRequest creditRequest) {
			System.out.println("Credit request is in rejected state"); 
		}
	};
	
	public abstract void printInfo(CreditRequest creditRequest);

}
