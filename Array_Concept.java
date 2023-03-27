package com.java.array.ArrayDemo;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	 @SuppressWarnings("resource")
		 Scanner sc=new Scanner(System.in);
    	 int n=sc.nextInt();
    	 sc.nextLine();
         //    int A[]=new int[n]; 1D Array of integers
//             int a[][]=new int [3][5]; 2D Array
//             int a[][]=new int [4][];  Jagad Array
//         for(int i=0;i<n;i++) {
//        	 A[i]=sc.nextInt();
//        	 if(i!=n-1) {
//        		 sc.nextLine();
//        	 }
//         }
//         for(int i=0;i<n;i++) {
//        	 System.out.println(A[i]);
//         }
    	 
//       >>>>> Object Array
    	 
    	 Calci c[]=new Calci[n];
    	 for(int i=0;i<n;i++) {
    		 int a=sc.nextInt();
    		 sc.nextLine();
    		 int b=sc.nextInt();
    		 sc.nextLine();
    		 Calci c1=new Calci(a,b);
    		 c1.add(a, b);
    		 c[i]=c1;
    	 }
    	 
//       >>>> Enhanced For loop
    	 
    	 for(Calci c1 : c) {
    		 c1.disp();
    	 }
//       >>>> Normal for loop
    	 
//    	 for(int i=0;i<n;i++) {
//    		 c[i].disp();
//    	 }
    	 
    }
}
