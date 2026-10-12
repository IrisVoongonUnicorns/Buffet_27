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
		System.out.println("Welcome to The Land of Excess Peads.");
		System.out.println("Enter which charater you would like to be.");

		scanner sc = new Scanner(System.in);
		Sting name = sc.nextline();
		System.out.println("The name of the character is" + name + ".");
		System.out.println("Please enter the Role that you would like to be: Aespa WDA, illit pixie dust, ENpen baldie.");

		String name = sc.next();
		System.out.println("Your character name is" + name + ".");
		System.out.println("Would you like to be: Wizard, Warrior, and Rouge");
		Scanner sc2 = new scanner(System.in);
		String ans = sc2.nextLine();

		if(ans.equals("Wizard")) {
			System.out.println("You have chosen to be Wizard. You now have the ability to be Rich, powerful, and cast spells.");
		}
		else if(ans.equals("Warrior")) {
			System.out.println("You have chosen to be Warrior. You know have the ability to fight in battles");
		}
		else if(ans.equals("Rouge")) {
			System.out.println("You have chosen to be Rouge. You now have the ability to bomb and steal from the others.");
		}
		else {
			System.out.println("A character was not chosen. Please pick Wizard, Warrior, and Rouge.");
		}

		System.out.println("You can pick 4 characteristics with 10 points maximum each. You have 20 points in total to distribute your points into.");
		System.out.println("The traits to distribute your points into are listed down below.");
		System.out.println("Strength-  Buff and able to carry larger items");
		System.out.println("Dexterity-  Agile and moves quick");
		System.out.println("Intelligence-  Better at magic spells!");
		System.out.println("Charisma- How personable");

		Sytem.out.println("How many points would you like to put into Strength?");
		int strength = sc.nextInt();
		if (strength > 10) {
			else if(strength <=10);
			System.out.println("You have chosen to put in" + strength + "point to Strength.");
			int pointsRemain = 20 - strength;
			System.out.println("You have " + pointsRemain + "to distribute into the three remaining traits.");
		}
		Sytem.out.println("How many points would you like to put into Dexterity?");
		int Dexterity = sc.nextInt();
		if (Dexterity > 10) {
			else if(Dexterity <=10);
			System.out.println("You have chosen to put in" + Dexterity + "point to Dexterity.");
			int pointsRemain = 20 - Dexterity;
			System.out.println("You have " + pointsRemain + "to distribute into the two remaining traits.");
		}
		Sytem.out.println("How many points would you like to put into intelligence?");
		int intelligence = sc.nextInt();
		if (intelligence > 10) {
			System.out.println("You cannnot put more than 10 points into intelligence. Please insert a valid amount.");
			intelligence - sc.nextInt();
		}
			else if(intelligence <=10);{
			System.out.println("You have chosen to put in" + intelligence + "point to intelligence.");
			int pointsRemain = 20 - intelligence;
			System.out.println("You have " + pointsRemain + "to distribute into the other remaining traits.");
		}
		Sytem.out.println("How many points would you like to put into chrisma?");
		int chrisma = sc.nextInt();
		if (chrisma > 10) {
		System.out.println("You cannnot put more than 10 points into chrisma. Please insert a valid amount.");
			chrisma - sc.nextInt();	
		}
			else if(Dexterity <=10);{
			System.out.println("You have chosen to put in" + chrisma + "point to chrisma.");
			int pointsRemain = 20 - strength - Dexterity - intelligence;
			System.out.println("You have " + pointsRemain + "for chrisma");
			}


		System.out.println("You're" + name + ", the" + title + " of the forest.");
		System.out.println("You are a" + answer + " with the stats listed.");
		System.out.println("Strength: " + strength);
		System.out.println("Dexterity: " + Dexterity);
		System.out.println("Intelligence: " + intelligence);
		System.out.println("Chrisma: " + chrisma);
		System.out.println("...");
		System.out.println("Have fun and good luck" + name + ".");	

	}
}
