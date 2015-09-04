//Loren Railsback
//CSE 002
//Homework 2
//The purpose of this program is to calculate total cost of various items bought at a store, with and without tax.

public class Arithmetic{
    

	public static void main(String[] args) {
		
		//Number of pairs of socks
	     int nSocks=3;
	     //Cost per pair of socks
	     //(‘$’ is part of the variable name)
	     double sockCost$=2.58;
	     //Number of drinking glasses
	     int nGlasses=6;
	     //Cost per glass
	     double glassCost$=2.29;
	     //Number of boxes of envelopes
	     int nEnvelopes=1;
	     //cost per box of envelopes
	     double envelopeCost$=3.25;
	     double taxPercent=0.06;
		 double totalSockCost$;   //total cost of socks
		 double totalGlassCost$;
		 double totalEnvelopeCost$;
		 double sockTaxTotal;
		 double glassTaxTotal;
		 double envelopeTaxTotal;
		 double sockMath;
		 double glassMath;
		 double envelopeMath;
		 double totalTransaction;
		 double sockRound;
		 double glassRound;
		 double envelopeRound;
		 double newSock;
		 double newGlass;
		 double newEnvelope;
		 double notaxTotal;
		 double totalMath;
		 double totalRound;
		 
		 
		 totalSockCost$=sockCost$*nSocks;
		 totalGlassCost$=glassCost$*nGlasses;
		 totalEnvelopeCost$=envelopeCost$*nEnvelopes;
		 sockMath=taxPercent*totalSockCost$;
		 glassMath=taxPercent*totalGlassCost$;
		 envelopeMath=taxPercent*totalEnvelopeCost$;
		 sockTaxTotal=sockMath+totalSockCost$;
		 glassTaxTotal=glassMath+totalGlassCost$;
		 envelopeTaxTotal=envelopeMath+totalEnvelopeCost$;
		 totalTransaction=sockTaxTotal+glassTaxTotal+envelopeTaxTotal;
		 newSock = Math.round(sockTaxTotal*100);
		    sockRound = newSock/100;
		 newGlass = Math.round(glassTaxTotal*100);
		 	glassRound = newGlass/100;
		 newEnvelope = Math.round(envelopeTaxTotal*100);
				 envelopeRound = newEnvelope/100;
		 notaxTotal=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
		 totalMath = Math.round(totalTransaction*100);
		 totalRound = totalMath/100;
		 
		 
		 System.out.println("Socks");
		 System.out.println("3 Pairs");
		 System.out.println("Cost per Pair $" +sockCost$);
		 System.out.println("Total Cost of Socks Before Tax $" +totalSockCost$);
		 System.out.println("Cost of Tax $" +sockMath);
		 System.out.println("Total Cost of Socks After Tax $" +sockRound);
		 System.out.println("--------------------------------------------");
		 System.out.println("Glasses");
		 System.out.println("6 Glasses");
		 System.out.println("Cost per Glass $" +glassCost$);
		 System.out.println("Total Cost of Glasses Before Tax $" +totalGlassCost$);
		 System.out.println("Cost of Tax $" +glassMath);
		 System.out.println("Total Cost of Glasses After Tax $" +glassRound);
		 System.out.println("--------------------------------------------");
		 System.out.println("Envelopes");
		 System.out.println("1 Envelope");
		 System.out.println("Cost per Envelope $" +envelopeCost$);
		 System.out.println("Total Cost of Envelopes Before Tax $" +totalEnvelopeCost$);
		 System.out.println("Cost of Tax $" +envelopeMath);
		 System.out.println("Total Cost of Envelopes After Tax $" +envelopeRound);
		 System.out.println("--------------------------------------------");
		 System.out.println("Total Transaction Cost Before Tax $" +notaxTotal);
		 System.out.println("Total Transaction Cost After Tax $" +totalRound);
	}
}