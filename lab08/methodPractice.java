//Loren Railsback
//CSE 002
//Eric Fouh
//Lab 07


import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class methodPractice{
	
	public static void main(String[] args) {
		
		double x;
		double y;
    
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		System.out.println("Enter the first number");
		double n1;
		n1 = keyboard.nextDouble();
		System.out.println("Enter the second number");
		double n2;
		n2 = keyboard.nextDouble();
		System.out.println("Enter the third number");
		double n3;
		n3 = keyboard.nextDouble();
		System.out.println("Enter the fourth number");
		double n4;
		n4 = keyboard.nextDouble();
		System.out.println("Enter the fifth number");
		double n5;
		n5 = keyboard.nextDouble();
		System.out.println("Enter the sixth number");
		double n6;
		n6 = keyboard.nextDouble();
		System.out.println("Enter the seventh number");
		double n7;
		n7 = keyboard.nextDouble();
		System.out.println("Enter the eighth number");
		double n8;
		n8 = keyboard.nextDouble();
		System.out.println("Enter the ninth number");
    	double n9;
    	n9 = keyboard.nextDouble();
    	System.out.println("Enter the tenth number");
    	double n10;
    	n10 = keyboard.nextDouble();
    	
    	x = mean(n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
    	y = median(n5, n6);
    	print(x,y);
    	
	}
	
    
    public static double mean(double n1, double n2, double n3, double n4, double n5, double n6, double n7, double n8, double n9, double n10) {
    	
    	double x = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10)/10;
    	return x;
    }
  
    public static double median(double n5, double n6) {
    	
    	double y = (n5+n6)/2;
    	return y;
    	
    	
    }
	
    public static void print(double x, double y){
    	
    	System.out.println("The mean of all 10 numbers is "+x);
    	System.out.println("The median of all 10 numbers is "+y);
    	
    }
        	
}


