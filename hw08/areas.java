//Loren Railsback
//CSE 002
//Tuesday October 27, 2015
//The purpose of this program is to ask for a shape from the user and to allow various inputs based on the shape requested, then to calculate the area.

import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class areas{ //Begin public class
    
    private static Scanner keyboard; //initialize the scanner keyboard

	public static void main(String[] args) { 
		keyboard = new Scanner(System.in); //creates a new keyboard
		double radius = 1; //initializes all needed variables for area calculations
		double length = 1; //initializes all needed variables for area calculations
		double width = 1; //initializes all needed variables for area calculations
		double height = 1; //initializes all needed variables for area calculations
		double base1 = 1; //initializes all needed variables for area calculations
		double base2 = 1; //initializes all needed variables for area calculations
	
		boolean cont = true; //creates boolean necessary for while statement
		while(cont = true){ //begins while statement to loop program unless exit numbers are typed
						
	System.out.println("Find area: Type 1 for circle, 2 for rectangle, or 3 for trapezoid. ENTER ANY OTHER NUMBER TO STOP.");
	double shape  = keyboard.nextDouble(); //variable to determine which shape is calculated
			
		if (shape == 1) { //if statement to calculate area of a circle
			System.out.println("Enter radius of circle.");
			radius = keyboard.nextDouble(); //variable for the radius of the circle
			areas.area(radius); //calls the main method with the appropriate variables
		}
		else if (shape == 2) { //if statement to calculate area of a rectangle
			System.out.println("Enter lenth of rectangle");
			length = keyboard.nextDouble(); //variable for the length of the rectangle
			System.out.println("Enter width of rectangle");
			width = keyboard.nextDouble(); //variable for the width of the rectangle
			areas.area(length, width); //calls the main method with the appropriate variables
		}
		else if (shape == 3) { //if statement to calculate area of a trapezoid
			System.out.println("Enter height of trapezoid ");
			height = keyboard.nextDouble(); //variable for the height of the trapezoid
			System.out.println("Enter base1 of trapezoid ");
			base1 = keyboard.nextDouble(); //variable for the first base of the trapezoid
			System.out.println("Enter base2 of trapezoid ");
			base2 = keyboard.nextDouble(); //variable for the second base of the trapezoid
			areas.area(height, base1, base2); //calls the main method with the appropriate variables
		}
		else if (shape != 1 || shape != 2 || shape != 3) { //if statement to terminate the loop if any other number is entered
			cont = false;
			System.out.println("____________________"); //displays a message saying that the program was terminated
			System.out.println("|Program Terminated|");
			System.out.println("--------------------");
			break;
		}
		
	  }
				
	}
	public static double area(double radius) { //method to determine area of a circle
		double area = 1;
		area = area * 3.14159 * radius * radius; //calculation to determine area
		System.out.println("The area of the circle is " + area); //prints the area to the user
		return area; //returns the area in the form of a double to complete the method
		
	}
	public static double area(double length, double width) { //method to determine area of a rectangle
		double area = 1;
		area = area * length * width; //calculation to determine area
		System.out.println("The area of the rectangle is " + area); //prints the area to the user
		return area; //returns the area in the form of a double to complete the method
		
	}
	public static double area(double height, double base1, double base2) { //method to determine area of a trapezoid
		double area = 1;
		area = area * ((base1 + base2) / 2) * height; //calculation to determine area
		System.out.println("The area of the trapezoid is " + area); //prints the area to the user
		return area; //returns the area in the form of a double to complete the method
	}	
	
}