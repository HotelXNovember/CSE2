//Loren Railsback
//September 03, 2015
//CSE 002
//The purpose of this program is to show the user minutes per trip, counts per trip, distance per trip, and distance for multiple trips combined.
public class Cyclometer{
    
    public static void main(String [] args){
    
    
    int secsTrip1=480; //sets the amount of time in seconds for trip 1
    int secsTrip2=3220; //sets the amount of time in seconds for trip 2
    int countsTrip1=1561; //sets the amount of counts for trip 1
    int countsTrip2=9037; //sets the amount of counts for trip 2
    double wheelDiameter=27.0, //sets the value for wheel diameter
        PI=3.14159, //sets the value for Pi
            feetPerMile=5280, //sets the value for feet in a mile
            inchesPerFoot=12, //sets the value for inches in a foot
            secondsPerMinute=60; //sets the value for seconds in one minute
    double distanceTrip1, distanceTrip2,totalDistance; //setting the variable for trip distances as a double
    System.out.println("Trip 1 took "+
    (secsTrip1/secondsPerMinute)+" minutes and had "+
    countsTrip1+" counts."); //calculating the minutes and counts for trip 1
    System.out.println("Trip 2 took "+
    (secsTrip2/secondsPerMinute)+" minutes and had "+
    countsTrip2+" counts."); //calculating the the minutes and counts for trip 2
    distanceTrip1=countsTrip1*wheelDiameter*PI;
    // Above gives distance in inches
    //(for each count, a rotation of the wheel travels
    //the diameter in inches times PI) 
    distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles 
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
    totalDistance=distanceTrip1+distanceTrip2; //calculates the total distance of trip 1 and 2
    System.out.println("Trip 1 was "+distanceTrip1+" miles"); //prints the distance for trip 1
    System.out.println("Trip 2 was "+distanceTrip2+" miles"); //prints the distance for trip 2
    System.out.println("The total distance was "+totalDistance+" miles"); //prints the total distance of both trips

    } //end of main method 

} //end of class