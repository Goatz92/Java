package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prompts the user to enter a year
 * Prints if the year is a leap year
 * or not
 */
public class LeapYearApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean leapYear = false;
        System.out.println("Please enter an integer representing the Year");
        inputYear = in.nextInt();
        if (inputYear % 4 == 0){ //1st check: if year can be divided by 4.
            if (inputYear % 100 == 0){ //2nd check: if year can be divided by 100.
                if (inputYear % 400 == 0) //3rd check: if year can be divided by 400.
                    leapYear = true;
                else leapYear = false;
            }
            else leapYear = true; //The year can NOT be divided by 100 but CAN be divided by 4.
        }
        else leapYear = false;
        if (leapYear)
            System.out.printf("The year %d is a Leap Year", inputYear);
        else
            System.out.printf("The year %d is not a Leap Year", inputYear);
    }
}

