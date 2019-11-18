package com.revature;

class Example5 extends Thread{  
    public void run(){  
    	try{Thread.sleep(10000);}catch (Exception e) {}
        System.out.println("shut down hook task completed..");  
    }  
}  
  
public class TestShutdownHook{  
public static void main(String[] args)throws Exception {  
  
Runtime r=Runtime.getRuntime();   
r.addShutdownHook(new Example5());  
r.addShutdownHook(new MyThread()); 
System.out.println("Now main sleeping... press ctrl+c to exit");  
try{Thread.sleep(3000);}catch (Exception e) {}  
}  
}  