package com.design_patterns.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BankEmployee {
	private String name; 
	private String dept; 
	private int salary; 
	
	private List<BankEmployee> subordinates;

	public BankEmployee(String name,String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<BankEmployee>();
	}

	public void add(BankEmployee e) {
		subordinates.add(e);
	}

	public void remove(BankEmployee e) {
		subordinates.remove(e);
	}

	public List<BankEmployee> getSubordinates(){
		return subordinates;
	}

	public void printEmployee() {
		System.out.println(this);
		if (!subordinates.isEmpty()) {
			for (BankEmployee employee : getSubordinates()) {
				employee.printEmployee(); 
			} 
		}
	}
	
	public String toString(){ 
		return ("Employee :[ Name : "+ name +", dept : "+ dept + ", salary :" + salary+" ]"); 
	}

}
