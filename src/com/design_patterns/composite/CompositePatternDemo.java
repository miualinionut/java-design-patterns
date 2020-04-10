package com.design_patterns.composite;

public class CompositePatternDemo {
	
	public static void main(String[] args) { 
		BankEmployee ceo = new BankEmployee("John", "CEO", 30000);
		
		BankEmployee headFrontDesk = new BankEmployee("Robert", "Head Front Desk", 20000); 
		BankEmployee headSalaries = new BankEmployee("Michel", "Head Salaries", 20000); 
		BankEmployee clerk1 = new BankEmployee("Laura", "Salaries", 10000); 
		BankEmployee clerk2 = new BankEmployee("Bob", "Salaries", 10000); 
		BankEmployee salesExecutive1 = new BankEmployee("Richard", "Front Desk", 10000); 
		BankEmployee salesExecutive2 = new BankEmployee("Rob", "Front Desk", 10000); 
		
		ceo.add(headFrontDesk); 
		ceo.add(headSalaries); 
		
		headFrontDesk.add(salesExecutive1); 
		headFrontDesk.add(salesExecutive2); 
		
		headSalaries.add(clerk1);
		headSalaries.add(clerk2); 
		
		//print all employees of the organization
		ceo.printEmployee();
		
	}
	

}
