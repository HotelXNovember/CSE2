import java.util.Scanner;

public class Interest{
    
    private static Scanner keyboard;

	public static void main(String[] args) {
    
    double intrate;
    double oldbalance;
    double balance;
    double math;
    double newnum;
    double finalnum;
    keyboard = new Scanner(System.in);

    System.out.println("Enter interest rate");
    intrate = keyboard.nextDouble();
    System.out.println("Enter current balance");
    oldbalance = keyboard.nextDouble();
    math = intrate * oldbalance;
    balance = math + oldbalance;
    newnum = Math.round(balance * 100);
    finalnum = newnum/100;
    
    System.out.println("Balance = " + finalnum);
    }
        
}