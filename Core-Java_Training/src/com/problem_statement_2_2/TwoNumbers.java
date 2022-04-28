package com.problem_statement_2_2;

public class TwoNumbers {

		  public static void main(String[] args) {

		    int i = 1, n = 13, firstTerm = 1, secondTerm = 3;
		    System.out.println("first number: "+i);
		    System.out.println("Second number: "+n);
		    System.out.println("Fibonacci Series till " + n + " terms:");
		    
		    for(i=1;i<=n;i++)
		    {
		    	 System.out.print(firstTerm + ", ");
		    	 int nextTerm = firstTerm + secondTerm;
			      firstTerm = secondTerm;
			      secondTerm = nextTerm;
			     
		    }
		    
		  /*  while (i <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

		      i++;
	    }*/
	  }
	}
