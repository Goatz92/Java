package gr.aueb.cf.ch2;

/**
 * User inputs the Farenheit degrees
 * Converts it to Celsius
 * Only provides integers as results
 *
 * @author Goatz
 */

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int farenheit = 0;
        int celsius = 0;
        System.out.println("Please insert an integer for Fahrenheit degrees");
        farenheit = in.nextInt();
        celsius = 5*(farenheit - 32) / 9; //Farenheit to Celsius conversion formula

        System.out.printf("%d\u2109 are equal to %d\u2103", farenheit, celsius);
    }
}
