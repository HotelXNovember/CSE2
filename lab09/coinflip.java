//Loren Railsback
//CSE 002
//Eric Fouh
//Lab 09
//the purpose of this program is to simulate coin flips.


import java.util.Scanner; //imports the utility that allows java to read your keyboard.
public class coinflip{
	
	public static void main(String[] args) {
		Scanner keyboard;
		keyboard = new Scanner(System.in);
		boolean cont = true;
		while(cont = true){
			System.out.println("Enter number of coin flips");
			int x = keyboard.nextInt();
			if(x>100){
				cont = false;
			}
				else System.out.println(flipcoin(x));
				break;
		}
		
	double random = 0;	
	random = flipcoin(random);
		
		if(random == 1.0){
			System.out.println("True / " +random);
		}
		else if(random == 0.0){
			System.out.println("False / " +random);
		}
		
	}
	
	public static double flipcoin(double random){
		random = Math.round(Math.random() * 1);
		return random;	
	}
	
	public static String flipcoin(int n){
		int heads = 0;
		int tails = 0;
		if(n==0)
			return flipcoin(n);
		else
		{
			for(int x = 0; x<n; x++)
			{
				double flipcoin = Math.random();
				if(flipcoin>.5)
					heads++;
				else
					tails++;
			}
			return "Heads: " + heads + "\nTails:" + tails;
		}
	}
}


