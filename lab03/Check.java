//Loren Railsback
//CSE 002
//The purpose of this program is to obatin input from the user to determine the price of a check, the percent tip, and the number of ways it should be split.

import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class Check{
    
    private static Scanner keyboard;

	public static void main(String[] args) {
    
    double checkCost; //cost of check before tax
    double tipRate; //percent of tip before decimal form
    double tipDec; //percent of tip after put into decimal form
    double checkMath; //intermediate numbers for calculation of math
    double checkTip; //total cost of check with tip
    double numSplit; //number of ways to split the check
    double finalBalance; //final balance after split between people
    keyboard = new Scanner(System.in);

    
    System.out.println("Enter cost of check");
    checkCost = keyboard.nextDouble();
    System.out.println("Enter percent for tip");
    tipRate =keyboard.nextDouble();
    tipDec =  tipRate/100;
    System.out.println("Enter number of ways to split check");
    numSplit = keyboard.nextDouble();
    
    checkMath = checkCost*tipDec; //math for calculating intermediate numbers
    checkTip = checkMath + checkCost; //math for determining cost of check with tip
    finalBalance = checkTip/numSplit; //math for determining final balance after split
    
    System.out.println("Cost per Person =" +finalBalance); //prints cost per person to the user
    
	}
}