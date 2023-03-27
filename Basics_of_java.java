import java.util.Scanner;

public class Basics_of_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		// There are 2 type of data types in java
		
		// 1)Primitive 2)?
		
		// 1.a)Integer 1.b)Float 1.c)Double 1.d)Character 1.e) Boolean
		
		// Integer Type ->Long(8 bytes),Short(2 bytes),Int(4 bytes),Byte (1 byte)
		
		// Float Type ->Float(4 bytes), Double(8 bytes)
		
		// Character ->char(2 bytes) UNICODE is Followed by JAVA
		
		// Literals are the values assigned to a variable
		// (10_000) this will give 10000 as output but help programmer to keep things sorted
		
		// Example ------>>>>>>
		
		int a=23;
		float b=2.3f;
		double c=3.4d;
		char d='d';
		boolean l=true;// boolean doesn't support 0 and 1 as true and false
		System.out.println(a+","+b+","+c+","+d+","+l);
		
		
		// >>>>>>> Lecture -2 Example Type Conversion and Casting
		
		int a1=(int)2.3;  //Casting is done here 
		byte bb=127;
		int aa=257;
		aa=bb; //Example of Conversion
		
		
		 // >>>>>>> Operators Logical,Assignment, relational 
		
	    // ++,--,+,-,*,%,/ ,, = ,, and,or,not,
		
	   // >>>>>>>> If else, Switch statements and ternary
	   int ak=2;
	   if(ak%2==0)System.out.println("Even");
	   else System.out.println("odd");
	   
	   String c1;
	   Scanner sc=new Scanner(System.in);
	   c1=sc.nextLine();
       switch(c1) {
	   case "+":{System.out.println("Add");break;}
	   case "-":{System.out.println("Sub");break;}
	   default:{System.out.println("Invalid char");break;}
	   }
		
	   int a11=2;
	   System.out.println((a11%2==0)?"e":"o");
		
      // >>>>>>>> Loops, for loop, while loop, do while loop
		
	  // Here we took very basic example to understand the above three loops 
		
	  for(int i=1;i<=10;i++) {
		  System.out.println(i);
	  }
	  int i=1;
	  while(i<=10) {
		  System.out.println(i);
		  i++;
	  }
	  i=1;
	  do {
		  System.out.println(i);
		  i++;
	  }while(i<=10);
		
	}

}
