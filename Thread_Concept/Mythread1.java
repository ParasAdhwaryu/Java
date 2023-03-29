package com.practicing.Threads.Thread_Concept;

public class Mythread1 extends Thread{
   public void run() {
	   while(true) {
	   System.out.println("This is Thread 1");
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   }
   }
}
