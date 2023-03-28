package com.practicing.streamApi.StreamApi_Concept;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.stream.Stream;

public class Stream_Api
{
    public static void main( String[] args )
    {
    	List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(30);
        list.add(40);
        list.add(100);
        list.add(199);
        Stream<Integer> s1=list.stream(); // Stream is created we create stream to save the original list from getting changes and all the changes are done in stream
        Stream<Integer> s2=s1.map((n)->n%5); // Map method is used to modify the elements of the stream and returns stream
        Stream<Integer> s3=s2.filter((n)->n%2==0); // Filter method is used to get the elements from the previous stream according to the condition and returns new stream
        s3.forEach(n->System.out.println(n)); // ForEach method is used to iterate over the stream
        int s4=s3.reduce(0,(a,b)->a+b); // Reduce method is used to converge the stream into single element
        System.out.println(s4);
    }
}
