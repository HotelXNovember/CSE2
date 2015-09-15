//Loren Railsback
//CSE 002
//The purpose of this program is to find the amount of time until dinner starts.
import java.util.Scanner; //imports the utility that allows java to read your keyboard.

public class Timer{
    
    private static Scanner keyboard;

	public static void main(String[] args) {
    
    int currentTime; //holds value for current time
    int currentTimeHours; //holds value for just hours
    int currentTimeMinutes; //hold value for just minutes
    int dinnerTime; //value for time of dinner
    int dinnerTimeHours; //value for time in just hours
    int dinnerTimeMinutes; //value for time in  just minutes
    int hoursLeft; //number of hours until dinner
    int minutesLeft; //number of minutes until dinner
    keyboard = new Scanner(System.in); //begins the process of allowing keyboard input

    
    System.out.println("Enter current time in form HHMM:");
    currentTime = keyboard.nextInt(); //gathers data from keyboard to input time
    currentTimeHours=currentTime/100;
    currentTimeMinutes=((currentTimeHours*100)-currentTime);
    System.out.println("Enter time of dinner in form HHMM:");
    dinnerTime = keyboard.nextInt(); //gathers data from keyboard to input time
    dinnerTimeHours=dinnerTime/100;
    dinnerTimeMinutes=((dinnerTimeHours*100)-dinnerTime);
    hoursLeft=dinnerTimeHours-currentTimeHours;
    minutesLeft=dinnerTimeMinutes-currentTimeMinutes;
    if (currentTimeMinutes<0){ //determines whether or not an hour needs to be subtracted to account for same-hour times
        hoursLeft = hoursLeft-1;
            minutesLeft = (Math.abs(minutesLeft));
    }
    
    
    System.out.println("Time until dinner = " +(Math.abs(hoursLeft))+" hours and " +(Math.abs(minutesLeft))+" minutes."); //prints time until dinner
        
	}
}