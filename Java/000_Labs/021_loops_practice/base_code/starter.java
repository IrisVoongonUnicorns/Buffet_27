/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner iv = new Scanner(System.in);
		int dom = (int)(Math.random()*1001+1);
    System.out.println("Welcome, pick a number between 1-1000");
	int tb = iv.nextInt();
	while (tb!=dom){
		if (tb==dom){
			System.out.println("Correct number.");
			break;
		}
		else if (tb>dom){
			System.out.println("The number is higher than the requested number");
			tb = iv.nextInt();
		}
		else if (dom>tb){
			System.out.println("The number is lower than the requested number");
			tb = iv.nextInt();
		}
	}

 

		
	}
}
