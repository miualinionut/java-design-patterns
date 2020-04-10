package com.design_patterns.interface_segregation_principle.bad_example;

// interface segregation principle - bad example
interface Worker {
	public void work();
	public void eat();
}

class WorkerImpl implements Worker {
	public void work() {
		//working
	}
	
	public void eat() {
		//eating in lunch break
	}
}

class Robot implements Worker {
	public void work() {
		//working much more
	}

	public void eat() {
		//do nothing
	}
}