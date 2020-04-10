package com.design_patterns.interpreter;

public class InterpreterPatternDemo {
	
	public static Expression isEmployed(String employeeName){ 
		Expression employee = new TerminalExpression(employeeName); 
		return employee; 
	} 
	
	public static Expression isEmployedInDepartment(String employeeName, String departmentName){ 
		Expression employee = new TerminalExpression(employeeName); 
		Expression department = new TerminalExpression(departmentName); 
		return new AndExpression(employee, department); 
	} 
	
	public static void main(String[] args) { 
		Expression isEmployed = isEmployed("Robert"); 
		Expression workingDepartment = isEmployedInDepartment("Laura", "Salaries"); 
		System.out.println("Robert is employer of the bank? " + isEmployed.interpret("Robert")); 
		System.out.println("John is employer of the bank? " + isEmployed.interpret("John")); 
		System.out.println("Laura works for the salaries department? " + workingDepartment.interpret("Laura works for Salaries")); 
	}

}
