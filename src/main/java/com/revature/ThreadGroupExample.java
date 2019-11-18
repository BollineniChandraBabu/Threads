package com.revature;

public class ThreadGroupExample implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) throws InterruptedException {  
	   ThreadGroupExample runnable = new ThreadGroupExample();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
         System.out.println("activeCount() :"+tg1.activeCount());
          Thread t1 = new Thread(tg1, runnable,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, runnable,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, runnable,"three");  
          t3.start();  
          System.out.println("activeCount() :"+tg1.activeCount());
          System.out.println("Thread Group Name: "+ t1.getThreadGroup());
          t1.join();  
          t2.join(); 
          t3.join();
         
          
			tg1.destroy();
			
		System.out.println("isDestroyed() :"+tg1.isDestroyed());
  System.out.println("Thread Group Name: "+ t1.getThreadGroup());
  System.out.println(Thread.currentThread().getThreadGroup());
    
    }  
   }  