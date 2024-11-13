package gr.aueb.cf.ch2;

import java.util.Scanner;

/** User inputs a value for Day, Month and Year
 * Prints them out in date form
 *
 * @author Goatz
 */
public class DateApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int days = 0;
        int months = 0;
        int years = 0;
        int formattedYear = 0;

        System.out.println("Please enter Day, Month, Year");
        System.out.println("Day");
        days = in.nextInt();
        System.out.println("Month");
        months = in.nextInt();
        System.out.println("Year");
        years = in.nextInt();
        formattedYear = years % 100;

        System.out.printf("%02d/%02d/%2d", days, months, formattedYear);


    }
}
