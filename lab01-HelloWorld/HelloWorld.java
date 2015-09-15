import java.util.Scanner;

public class HelloWorld{
    
    private static Scanner keyboard;

	public static void main(String[] args) {
    
    double num1;
    double num2;
    double num3;
    double nummath;
    double numavg;
    keyboard = new Scanner(System.in);

    
    System.out.println("Enter number 1:");
    num1 = keyboard.nextDouble();
    System.out.println("Enter number 2:");
    num2 = keyboard.nextDouble();
    System.out.println("Enter number 3:");
    num3 = keyboard.nextDouble();
    nummath = num1 + num2 + num3; 
    numavg = nummath/3;   
    System.out.println("Average of 3 numbers = " +numavg);
    
    int zed = (int) (Math.pow(3,2) / 2);
    System.out.println(zed);
	}
}