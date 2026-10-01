/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        
        int red = (int)(Math.random()*255);
        int green = (int)(Math.random()*255);
        int blue = (int)(Math.random()*255);
        getColor(red, green, blue);

        int inv = 256-red;
        int ver = 256-green;
        int res = 256-blue;
        getColor(inv, ver, res);

        getColor(red, green, blue);
        getColor(green, blue, red);
        getColor(blue, green, red);

       int yunju1 = (int)(Math.random()*128);
        int moka1 = (int)(Math.random()*128);
        int heeroz1 = (int)(Math.random()*128);
        getColor(yunju1, moka1, heeroz1);

        int yunju2 = (int)(Math.random()*128+128);
        int moka2 = (int)(Math.random()*128+128);
        int heeroz2 = (int)(Math.random()*128+128);
        getColor(yunju2, moka2, heeroz2);

        int yunju3 = (int)(Math.random()*129);
        int moka3 = (int)(Math.random()*129);
        int heeroz3 = (int)(Math.random()*128+128);
        getColor(yunju3, moka3, heeroz3);

        int yunju4 = (int)(Math.random()*129+128);
        int moka4 = (int)(Math.random()*225);
        int heeroz4 = (int)(Math.random()*225);
        getColor(yunju4, moka4, heeroz4);



		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        



    }
}
