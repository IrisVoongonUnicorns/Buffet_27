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
		system.out.println("Do you want to be a Wizard, Warrior, or Rougue?");
		Scanner sc = new Scanner(System.in);
		Sting guess = sc.nextline();

		if(guess.equals("Wizard")) {
			System.out.println("You have chosen Wizard. You can now run a magic through a casting");
		}
		else if(guess.equals("Warrior")) {
			System.out.println("You have chosen Warrior. You can create and write spells for anyone to use");
		}
		else if(guess.equals("Rougue")) {
			System.out.println("You have chosen Rougue. You now have the ability of precision");
	}
	else {
		System.out.println("Please pick a role for this program to work");
	}
}
