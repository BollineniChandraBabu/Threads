package multithreadingexamples;

public class Example1 extends Thread{  
	public void run(){  
		System.out.println("thread is running...");  
		}  
		public static void main(String args[]){  
			Example1 thread1=new Example1();  
			thread1.start();  
		 }  
		}  