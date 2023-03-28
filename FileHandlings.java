package com.practicing.File_Handling.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlings 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ) throws IOException
    {
    	Scanner sc=new Scanner(System.in);
        FileReader fr = new FileReader("IoFile.txt");;
        FileWriter fw=new FileWriter("IoFile.txt");
        BufferedReader br=new BufferedReader(fr);;
        BufferedWriter bw=new BufferedWriter(fw);
		String line=null;
        while((line=br.readLine())!=null) {
        	System.out.println(line);
        }
        String Continue="Y";
        while(Continue.equals("Y")) {
        	System.out.println("Enter the line you want to add in the file");
        	String str=sc.nextLine();
        	bw.write(str);
        	System.out.println("To Continue please Enter Y");
        	Continue=sc.nextLine();
        }
    }
}
