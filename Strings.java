package com.practice.strings.string_concept;

public class Strings {

	public static void main(String[] args) {
		 String s="Lost   Soul";
		 
		 String a[]=s.split("['_']",0);
		 for(String ele:a) {
			 System.out.println(ele);
		 }
		 
//		 >>>> Given below are the most common methods used in String
		 
		 System.out.println(s.substring(1, 5));
		 System.out.println(s.charAt(3));
		 s=s.concat("fgh");
		 System.out.println(s);
		 System.out.println(s.toLowerCase());
		 System.out.println(s.toUpperCase());
		 System.out.println(s.equals("Lost_Soulfgh"));
		 System.out.println(s.compareTo("Lost_Soulfgh"));
		 System.out.println(s.length());
		 System.out.println(s.trim());
		 System.out.println(s.isEmpty());
		 System.out.println(s.replace('o','0'));
		 System.out.println(s.repeat(2));

//       >>>>> StringBuffer
		 
//		 A StringBuilder is a class in the .NET Framework that is used to manipulate strings. It is designed to be more efficient than using a regular string object because it allows for the manipulation of a string without creating a new object each time.
//
//		 Here are some important methods of the StringBuilder class:
//
//		 Append: This method appends a string or a character to the current StringBuilder object. It returns the same StringBuilder object.
//
//		 Insert: This method inserts a string or a character at a specified position in the current StringBuilder object.
//
//		 Replace: This method replaces a specified substring with another string in the current StringBuilder object.
//
//		 Remove: This method removes a specified number of characters from the current StringBuilder object, starting at a specified position.
//
//		 ToString: This method returns the string that is represented by the current StringBuilder object.
//
//		 Clear: This method removes all characters from the current StringBuilder object.
//
//		 Capacity: This property gets or sets the maximum number of characters that can be contained in the memory allocated by the current instance of the StringBuilder class.
//
//		 Length: This property gets or sets the length of the current StringBuilder object.

//       Reverse: This method is used to reverse the Given string.
		 
//		 These methods allow you to manipulate a string in a more efficient manner, making it easier to perform operations such as concatenation, insertion, and deletion.

//
		 StringBuffer sb=new StringBuffer();
		 sb.insert(0, 'a');
		 System.out.println(sb.hashCode());
		 sb.append("bkg");
		 System.out.println(sb.hashCode());
		 System.out.println(sb.charAt(2));
		 sb.setCharAt(2, 'd');
		 System.out.println(sb);
		 
//       >>>>> String builder
//		 String Builder is a class in Java that is used to manipulate strings in a more efficient manner than the standard String class. Here are some of the important methods of StringBuilder:
//
//			 append(): This method is used to append a string or any other data type to the StringBuilder object. It returns the same StringBuilder object, allowing for chaining of multiple append calls.
//
//			 insert(): This method is used to insert a string or any other data type at a specific position in the StringBuilder object.
//
//			 delete(): This method is used to delete characters from the StringBuilder object. It takes the starting and ending positions of the characters to be deleted.
//
//			 replace(): This method is used to replace a specific portion of the StringBuilder object with another string or character.
//
//			 substring(): This method is used to extract a portion of the StringBuilder object and return it as a new String object.
//
//			 capacity(): This method returns the current capacity of the StringBuilder object. Capacity is the amount of storage that is allocated for the StringBuilder object.
//
//			 setCharAt(): This method is used to set a specific character at a specified index in the StringBuilder object.
//
//			 indexOf(): This method is used to find the index of a specific character or string within the StringBuilder object.
//
//			 length(): This method returns the length of the StringBuilder object.
//
//			 These methods are useful in manipulating strings in Java programs and can make operations such as concatenation, insertion, deletion, and replacement more efficient.
//		 
		 StringBuilder sbd=new StringBuilder();
		 sbd.append("akg");
		 System.out.println(sbd);
		 
	}

}
