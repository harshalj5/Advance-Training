package com.problem_statement_2_1;

import java.util.Scanner;

public class StringFunctions {
	
	   public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	      String upper = str.toUpperCase();
	      System.out.println("Upper Case: "+upper);
	      
	      System.out.println("String length :"+length);
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }
	}
