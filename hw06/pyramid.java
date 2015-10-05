//Loren Railsback
//CSE 002
//Eric Fouh
//Homework 06
//The purpose of this program is to obtain a size variable to determine how many asterisks make up a scalable pyramid.


import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class pyramid{
    
    private static Scanner keyboard; //introduces the a new scanner called keyboard

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in); //puts new scanner into program
		
		int size = 0; //creates new size variable to keep input from user to determine pyramid size
	
		System.out.println("Enter how large of a pyramid you would like."); //asks user how large of a pyramid they would like
		
		size = keyboard.nextInt(); //asks user for input from keyboard
		
		
		
	    
		for (int space1 = 1; space1 <= size; space1=space1+2) { //for statement to determine the size of pyramid using input from scanner
	        
			int space = (size - space1)/2; 
	        
			for(int pyr = 0; pyr < size; pyr++) {
	        
				if(pyr < space || pyr >= (size - space)) {
	            
				System.out.print(" ");
	           
				} else {
	            
				System.out.print("*");
				
	            }
	        }
	        System.out.println();
		
		}
    }

}