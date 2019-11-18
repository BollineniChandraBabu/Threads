package com.revature;

public class Example2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Example2 ex2 = new Example2();
		Thread t1 = new Thread(ex2);
		t1.start();
	}
}