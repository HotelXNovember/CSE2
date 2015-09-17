//Loren Railsback
//CSE 002
//Thursday September 17, 2015
//The purpose of this program is to prompt the user for an operator and 2 numbers so that they may calculate a problem.
import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class Calculator{ //Begin public class
    
    private static Scanner keyboard; //initialize the scanner keyboard

	public static void main(String[] args) { 
		keyboard = new Scanner(System.in);
	double numA; //initialize the first number
	double numB; //initialize the second number
	
	System.out.println("Enter the first number"); //prints out directions 
	numA = keyboard.nextDouble(); //asks user for first number
	System.out.println("Enter the second number"); //prints out directions
	numB = keyboard.nextDouble(); //asks user for second number
	System.out.println("Enter your operator (+, -, *, /"); //prints out directions
	String calculator = keyboard.next(); //asks user for operator
	
	
	double output;
	switch (calculator) { //begins switch statement
	case "+": System.out.println(numA+numB); //case if user wants addition
	break;
	case "-": System.out.println(numA-numB); //case if user wants subtraction
	break;
	case "*": System.out.println(numA*numB); //case if user wants multiplication 
	break;
	case "/": System.out.println(numA/numB); //case if user wants division
	break;
	default: System.out.println("Illegal Operator"); //case if user enters invalid operator
	break;
	}
	
	
	
	}

}