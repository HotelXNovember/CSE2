//Loren Railsback
//CSE 002
//Eric Fouh
//Lab 07


import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class encrypted_x{
    
    private static Scanner keyboard; //introduces the a new scanner called keyboard

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in); //puts new scanner into program
		
		int size = 0; //creates new size variable to keep input from user to determine X size
		System.out.println("Enter how large of an X you would like."); //asks user how large of an X they would like
		
		size = keyboard.nextInt();
		
		if(size < 0 || size > 100){
			System.out.println("Invalid Size");
			System.exit(1);	
		}
		
		for(int i = 0; i <= size; i++){
			
			
			for(int j = 0; j <= size; j++){
				
				if(j == i || j == size - i){
					System.out.print(" ");
				}
					else{
						System.out.print("*");
				}
				
			}
				System.out.println();
			
		}
		
		
	}
}