package com.design_patterns.solid.dependency_inversion_principle.bad_example;

// Dependency Inversion Principle - bad example

class WorkerImpl {
	public void work() {
		// ....working
	}
}

class Manager {
	WorkerImpl worker;

	public void setWorker(WorkerImpl w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}

class SuperWorker {
	public void work() {
		//.... working much more
	}
}

