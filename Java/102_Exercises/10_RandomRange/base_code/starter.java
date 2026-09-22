/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Enter 2 numbers to create a range for your random number"); 
        System.out.print("Please enter an integer: ");
        Scanner number = new Scanner (System.in);
        int minji = number.nextInt();

        System.out.print("Please enter another integer (bigger than the first): ");
        int danielle = number.nextInt();

		System.out.println("Your range is " + minji + " to " + danielle);
		int num1 = (int)Math.random()*((danielle-minji)+minji);
		int num2 = (int)Math.random()*((danielle-minji)+minji);
		int num3 = (int)Math.random()*((danielle-minji)+minji);
		int num4 = (int)Math.random()*((danielle-minji)+minji);
		int num5 = (int)Math.random()*((danielle-minji)+minji);
		System.out.println(num1 + ", " num2 + ", " num3 + ", " num4 + ", " num5 + ", ");


	}
}
