/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely.");
		System.out.println("Enter your number here.");
		Scanner sc = new scanner(System.in); 
		int a = sc.nextInt();
		System.out.println("Please put in a sperate number");
		int b = sc.nextInt();
		System.out.println("Please put in a third number");
		int c = sc.nextInt();
		
		if (a < b && a < c && b < c) {
			System.out.println(c + " is the greatest number");
		}

		if (b < a && a < b && c < b) {
			System.out.println(a + " is the greatest number");
		}

		if (c < b && a < b && a < c) {
			System.out.println(b + " is the greatest number");
		}

		if (c > a && c > b && b > a) {
			System.out.println(a + " is the smallest number");
		}


	}
	{
		System.out.println("Enter your number here.");
		Scanner sc = new scanner(System.in); 
		int h = sc.next.int(4);
		System.out.println()
		int i = 8;

		int j = 16;


	}
}
