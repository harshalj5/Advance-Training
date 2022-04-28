package com.problem_statement_3_2;

public class Medicineinfo{
	public void displayLabel(){
	System.out.println("Company : Globex Pharma");
	System.out.println("Address : Bangalore");
	}
	}
class Tablet extends Medicineinfo{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicineinfo{
	public void displayLabel(){
	System.out.println("Consumption as directed by thephysician");
	}
	}
class Ointment extends Medicineinfo{
	public void displayLabel(){
	System.out.println("for external use only");
}
}