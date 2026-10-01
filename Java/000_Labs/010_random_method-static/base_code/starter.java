/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*100+1);
		double number3 = (double)(Math.random()*1+2.5);
		double number4 = (double)(Math.random()*575.0+14.0);

		System.out.println("Random number between 0 and 9: " + number1);
		System.out.println("Random number between 1 and 100: " + number2);
		System.out.println("Random number between 2.5 and 3.5: " + number3);
		System.out.println("Random number between 14.0 and 589.0: " + number4);

		
	}
}
