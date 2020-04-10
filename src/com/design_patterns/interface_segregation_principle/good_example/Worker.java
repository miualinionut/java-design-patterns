package com.design_patterns.interface_segregation_principle.good_example;

// interface segregation principle - good example
interface Worker {
	public void work();
}

interface Eater {
	public void eat();
}

class WorkerImpl implements Worker, Eater {
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
}