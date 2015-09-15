//Loren Railsback
//CSE 002
//The purpose of this program is to calculate volume and surface area of a block.
import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class Block{
    
    private static Scanner keyboard;

	public static void main(String[] args) {
    
    double width; // declares variable for width
    double length; // declares variable for length
    double height; // declares variable for height
    double volume; // declares variable for volume
    double surfaceArea;  // declares variable for surface area
    keyboard = new Scanner(System.in); //introduces new scanner for ability to scan keyboard for input

    
    System.out.println("Enter width:");
    width = keyboard.nextDouble(); //keyboard input by user for width
    System.out.println("Enter length:");
    length = keyboard.nextDouble(); //keyboard input by user for length
    System.out.println("Enter height:");
    height = keyboard.nextDouble(); //keyboard input by user for height
    volume = width*length*height;
    surfaceArea = width*length*2+width*height*2+length*height*2; //equation for determining surface area
    System.out.println("Volume = " +volume); //prints out volume to user
    System.out.println("Surface Area = "+surfaceArea); //prints out surface area to user
    
	}
}