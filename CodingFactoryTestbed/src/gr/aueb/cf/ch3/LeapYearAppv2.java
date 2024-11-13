package gr.aueb.cf.ch3;
/**

 * year % 4 == 0 LEAP
 * year % 4 == 0 && year % 100 == 0 NOT LEAP
 * year % 4 == 0 && year % 100 == 0 && year % 400 == 0 LEAP
 */

import java.util.Scanner;

public class LeapYearAppv2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeapYear = false;
        System.out.println("Please enter the Year");
        year = in.nextInt();
        isLeapYear = ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));
        System.out.printf("Year is Leap: %b", isLeapYear);
    }
}
