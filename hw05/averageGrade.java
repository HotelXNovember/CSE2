//Loren Railsback
//CSE 002
//Thursday September 30, 2015
//The purpose of this program is to prompt the user for grades and average them together until the user stops the program.
import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class averageGrade{ //Begin public class
    
    private static Scanner keyboard; //initialize the scanner keyboard

	public static void main(String[] args) { 
		keyboard = new Scanner(System.in); //declares a new keyboard scanner that allows user input
	double numA; //initialize the first number
	boolean Stop = true; //declares a boolean variable and sets it equal to true
	double overallGrade = 0; //declares a variable to store overall grade and sets it equal to 0.
	double grade = 0; //declares a variable to hold the new grade and calculate the overall grade and sets it to 0.
	double loopCount = 0; //declares a variable to count the number of grades entered and sets it to 0.
	
	System.out.println("--------------------------"); //Prints a title to let the user know what program they are running.
	System.out.println("|AVERAGE GRADE CALCULATOR|");
	System.out.println("--------------------------");
	
	while (Stop = true) {
	System.out.println("Enter a grade between 0 and 100. Enter 999 to stop."); //prints out directions 
	numA = keyboard.nextDouble(); //asks user for a grade
	
	 if (numA <= 100 && numA >= 0) { //an if statement to determine if the number entered is valid and calculates the average if it is.
		loopCount=loopCount+1; //keeps track of the number of grades entered, which is the same as the amount of loops with valid numbers.
		grade = grade + numA; //calculates the new grade by adding the newly entered grade to the old stored average.
		overallGrade = grade/loopCount; //calculates the new average by dividing the new grade and average by the number of grades entered.
		System.out.println("Average Grade = " + overallGrade); //prints out the new averaged grade.
		System.out.println("--------------------------"); //displays a line break to keep things neat looking.
	}
	 else if (numA == 999) { // an if statement to terminate the program if the user enters "999"
			Stop = false; //sets the boolean to false to discontinue the loop
			System.out.println("Grade Calculator Terminated"); //prints out to the user that the program has entered.
			break; //finishes the loops with a break to stop the code.
	}

	 else if (numA < 0 || numA > 100) { //an if statement to tell the user that they entered an invalid value for a grade.
		System.out.println("Number must be between 0 and 100"); //prints out that the number was an invalid value
		System.out.println("--------------------------"); //prints out a line break to keep things neat.
	
	}	
	
		 }
	  }
   }

	

