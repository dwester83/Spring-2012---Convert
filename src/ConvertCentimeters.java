/*
 * Author: Daniel Wester
 *
 * Date: 01.26.12
 *
 * Course: 2243-01, Spring 2012
 *
 * Assignment: PGM1 Part 2
 *
 * Description: This program converts centimeters into yards, feet, and inches.
 *
 */

import java.util.Scanner;

public class ConvertCentimeters {

	public static void main (String[] args) {
		Scanner reader = new Scanner (System.in);
	
		//Variables
		double cent;
		int inch;
		int foot;
		int yard;
	
		//Constants
		final double CENT_INCH = 2.54;
		final int INCH_FOOT = 12;
		final int FOOT_YARD = 3;
	
		//Input
		System.out.println("Welcome,");
		System.out.println("This program will convert centimeters into:\n\tYard(s)\n\tFeet\n\tInch(es)\n");
		System.out.print("How many centimeters do you want to convert?: ");
		cent = reader.nextDouble(); 
	
		//Conversion
		inch = (int)((cent / CENT_INCH) + 0.5);
		foot = (inch / 12);
		yard = (foot / 3);
		foot = foot % FOOT_YARD;
		inch = inch % INCH_FOOT;

		//Output
		System.out.println("\n" + cent + " centimeters converts into " + yard + " yard(s), " + foot + " feet, and " + inch + " inch(es).");
		System.out.println("\nThe program is now ending.");
	
	}
}