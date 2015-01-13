/*
 * Author: Daniel Wester
 *
 * Date: 01.26.12
 *
 * Course: 2243-01, Spring 2012
 *
 * Assignment: PGM1 Part 1
 *
 * Description: This program converts seconds into hours, minutes, and seconds.
 *
 */

import java.util.Scanner;

public class ConvertSeconds {
	
	public static void main (String[] args) {
		Scanner reader = new Scanner (System.in);
		
		//Variables
		int seconds;
		int minutes;
		int hours;
		int secondsBeforeConvert;
		
		//Constants
		final int SEC_MIN = 60;
		final int MIN_HOUR = 60;
		
		//Input
		System.out.println("Welcome,");
		System.out.println("This program will convert seconds into:\n\tHour(s)\n\tMinute(s)\n\tSecond(s)\n");
		System.out.print("How many seconds do you want to convert?: ");
		secondsBeforeConvert = reader.nextInt();
		
		//Conversion
		minutes = secondsBeforeConvert / 60;
		hours = minutes / 60;
		minutes = minutes % MIN_HOUR;
		seconds = secondsBeforeConvert % SEC_MIN;
		
		//Output
		System.out.println("\n" + secondsBeforeConvert + " seconds converts into " + hours + " hour(s), " + minutes + " minute(s), and " + seconds + " second(s).");
		System.out.println("It can also be viewed in hours:minutes:seconds:  " + hours + ":" + minutes + ":" + seconds);
		System.out.println("\nThe program is now ending.");
		
	}
}