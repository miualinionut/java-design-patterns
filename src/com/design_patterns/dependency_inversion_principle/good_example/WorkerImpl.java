package com.design_patterns.dependency_inversion_principle.good_example;

//dependency inversion principle - good example
interface Worker {
 public void work();
}

class WorkerImpl implements Worker {
   public void work() {
	  //working� 
   }
}

class SuperWorker implements Worker {
   public void work() {
      //working much more� 
   }
}


class Manager {
	Worker worker;

	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
