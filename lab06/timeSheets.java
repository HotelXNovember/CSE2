//Loren Railsback
//CSE 002
//Lab 06
//Thursday October 1, 2015
//The purpose of this program is to gather data about a certain number of employees and calculate how much they were paid in total.
import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class timeSheets{ //Begin public class
    
    private static Scanner keyboard; //initialize the scanner keyboard

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
	int numTimesheet;
	System.out.println("Enter the number of employees to input data for.");
	System.out.println("------------------------------------------------");
	numTimesheet = keyboard.nextInt();
	int hours = 0; //sets necessary variables for program to 0
	int payRate = 0;
	int totalHours = 0;
	int totalPay = 0;
	int total = 0;
	
	int i = 0; //sets int i to 0
	while (i<numTimesheet) { //loop to go through all of the data for the inputed number of employees
		int j = 0;
		int numDay = 0;
		while (j<5){ //loop to go through the days of the week to make code more efficient
			numDay++; //adds a day to the numDay variable each loop to keep track of days
			System.out.println("Enter the number of hours worked on day " + numDay);
			hours = keyboard.nextInt(); //allows keyboard input to gather the hours worked each day
		    totalHours = totalHours + hours; //keeps track of total hours worked by employees
			j++; //adds 1 to int j each loop to keep track of days until loop finishes
						
		}
		
		System.out.println("Enter the pay rate of employee in cents.");
		payRate = keyboard.nextInt(); // allows keyboard input to get the pay rate for employees
		totalPay = totalPay + payRate; //keeps track of total hourly salary added together 
		i++; //adds 1 to int i to loop until all entered employees have data entered
		
	}
	
	total = totalHours * totalPay; //calculates the total amount paid off in cents
	System.out.println("Total amount paid out = " + total/numTimesheet + " cents"); //prints the total amount
			
	}
  
}