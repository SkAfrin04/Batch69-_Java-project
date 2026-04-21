package com.MultiThreading;

public class InterConnectedThread {

class Resource{
	int i = 0;
	boolean status = false;

	synchronized void put(int i) throws InterruptedException {
		while(status) {
			wait();
		}
		this.i=i;
		System.out.println("PUT : " + i);
		status = true;
		notify();
	}
	
	synchronized void get() throws InterruptedException {
		while(!status) {
			wait();		
		}
		System.out.println("GET : " + i);
		status = false;
		notify();
	}
}
class Producer implements Runnable{
     Resource r;
     Producer(Resource r){
    	 this.r = r;
    	 Thread t = new Thread(this , "Producer");
    	 t.start();
     }
	
	@Override
	public void run() {
		while{
			try {
				r.put(i++);
				
			}
		}
		
	}
	
}
class Consumer{

		
}
	public static void main(String[] args) {
	
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);

	}

}
