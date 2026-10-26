/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner fx = new Scanner(System.in);
		int mon= 100;
		System.out.println("Rule for Slot machine: ");
		System.out.println("1. The given amount is $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1-10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String H2H = fx.next();
		if (H2H.equals("No") || H2H.equals("no") || H2H.equals("N") || H2H.equals("n")){
			System.out.println("Okay, Come back tomorrow! $" + mon + "left to spend.");
		}
		while (H2H.equals("Yes") || H2H.equals("yes") || H2H.equals("Y") || H2H.equals("y")){
			if (mon==0){
				System.out.println("You've run out of money, please come back next time.");
				break;
			}

			System.out.println("You have " + mon + ". How much would you like to wager?");
			int yen= fx.nextInt();
			System.out.println("");
			System.out.println("Okay, lets play.");
			System.out.println("The given roles are");
			System.out.println("");
			System.out.println("----------------------------------------");
			int nu = (int)(Math.random()*11+1);
			int mb = (int)(Math.random()*11+1);
			int aes = (int)(Math.random()*11+1);
			System.out.println(" | " + nu + " | " + mb + " | " + aes + " | ");
			if (nu != aes && aes !=mb && nu !=mb){
				System.out.println("You're out of luck loser, better luck next time.");
				System.out.println("You now have $" + (mon-yen) + ".");
			}
			else if (nu==aes && aes!=mb);{
				System.out.println("You've won! Your wager has now doubled.");
				System.out.println("You now have $" + (mon+(yen*2)) + ".");
			}
			else if (nu!=aes && aes==mb);{
				System.out.println("You've won! Your wager has now doubled.");
				System.out.println("You now have $" + (mon+yen*2) + ".");
			}
			else if (nu==aes && aes!=mb);{
				System.out.println("You've won! Your wager has now doubled.");
				System.out.println("You now have $" + (mon+yen*2) + ".");
			}
			else if (nu!=aes && nu==mb);{
				System.out.println("You've won! Your wager has now doubled.");
				System.out.println("You now have $" + (mon+yen*2) + ".");
			}
			else{
				System.out.println("Would you like to play the Slots? (Yes/yes/Y/y)");
				H2H=fx.next();
				if (H2H.equals("No") || H2H.equals("no") || H2H.equals("N") || H2H.equals("n")){
			System.out.println("Okay, Come back tomorrow! $" + mon + " left to spend.");
			}
			}
	}
}
