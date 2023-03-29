package com.practicing.Threads.Thread_Concept;

/**
 * Hello world!
 *
 */
public class Threads 
{
    public static void main( String[] args )
    {
      // Concept of Threading is used to perform multithreading
      
      // MultiThreading is a concept of creating a multiple threads for the same process so that that particular process can perform multiple tasks at same time 
      // Example if you open any site on chrome then retrieving data and posting data is done using multiple threads.
    	
     // Multiprocessing is a way performing multiple process at same time
     // Example Like in your operating system you are running Google Chrome, Games, Visual studio code at same time.
    	
     //  MultiTasking is a way to handle the multiple task at same time
     //  Example Accessing server is a best example here the multiple user will be accessing the same server from different geographical locations at same time
    	
     // There are two ways to create the Threads in java 1) By Extending the thread class 2) By Implementing the Runnable Interface
    	
     // LifeCycle of Thread consist of start,runnable,running,terminate 
     
     // 1) Implements thread concept by extending the Thread class 
     Mythread1 t1=new Mythread1();
     Mythread2 t2=new Mythread2();
     t1.start();// This method is used to execute the run method of a class which extends Thread class 
     //t1.join(); //  This method says that until the t1 thread is fully executed t2 will not start its execution
     t2.start();
     t1.getPriority();// This method is used to get the priority of the thread default priority of thread is '5'
     t1.setPriority(9);// This method is used to set the priority;
     t2.setPriority(Thread.MAX_PRIORITY);// In this Max_Priority will provide the maximum priority to the 2nd thread
     //Threads.sleep(2000);// Sleep will hold the thread for the provided milliseconds
    }
}
