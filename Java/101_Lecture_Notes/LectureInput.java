/*
    Lecture note example - Input!!
*/
import java.until.Scanner

class LectureInput{
    public static void main(String args[]) {
        System.out.println ("Welcome to Yunju Heeroz");
        System.out.println ("Here's our menu:");
        System.out.print("1. plum Cucumber stick - ");
        double item1price = $2.47;
        System.out.println(item1Price);

        System.out.println("2. galbi - ");
        double item2price = $34.92;
        System.out.println(item2Price);

        System.out.println("3. tiramisu mini circle slice - ");
        double item3price = $19.65;
        System.out.println(item3Price);

        System.out.println("How many plum Cucumber sticks would you like?");
        Scanner sc = new Scanner(System.in);
        System.out.println("How much of plum cucumber stick do you want?");
        int hanni = sc.nextInt();
        System.out.println("plum cucumber stick- " + (item1price*hanni));

        System.out.println("How much of galbi do you want?");
        int hanni = sc.nextInt();
        System.out.println("galbi- " + (item2price*hanni));

        System.out.println("How much of tiramisu mini circle slice do you want?");
        int hanni = sc.nextInt();
        System.out.println("tiramisu mini circle slice- " + (item3price*hanni));

        double finaltotal = (item1price*hanni) + (item2price*hanni) + (item3price*hanni);

        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();

        double math = (tip/100 * finaltotal);

        System.out.println("Your total is: " + (finaltotal+tip));


	}
}
