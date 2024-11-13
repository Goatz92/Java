package gr.aueb.cf.testing;
/**
 * Function 1) Find all Leap years.
 * Finds all the leap years
 * between two integers input by user
 * then prints:
 * 1. All the leap years
 * 2. The number of leap years found
 * Function 2) Find if a year is a leap year
 * User inputs an integer for year
 * Prints if the year is/isn't a leap year
 */

import java.util.Scanner;

public class LeapYearTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int startYear = 0;
        int endYear = 0;
        int choice = 0;
        int years[];
        System.out.println("Leap Year finder!");    //Prints once at program Boot.
        System.out.println("Welcome");
        do {
            printMenu();
            choice = choice(in);
            if (choice == 3) {                      //Shut down state.
                System.out.println("Exiting...");
                break;
            } else if (choice == 1) {               //Executes yearValues method. The inputs are calculated in said method.
                years = yearValues(in);
                printLeapYears(years[0], years[1]); //Executes printLeapYears method.
            } else {
                leapYearFinder(in);                 //Executes when user inputs 2 in choice. Executes leapYearFinder method.
                }
        } while (choice != 3);                      //Repeats by printing starting menu. User must enter a choice between 1-3 again
    }

    /**
     * Calculates the number leap years found, between two integers
     * that user inputs
     * @param startYear
     * @param endYear
     */
    public static void printLeapYears(int startYear, int endYear) {

        boolean isLeapYear = false;
        boolean foundSome = false;
        int counter = 0;
        System.out.printf("From %d to %d the leap years are: \n", startYear, endYear);
        for (int i = startYear; i <= endYear; i++) {
            isLeapYear = ((i % 400 == 0) || (i % 4 == 0) && (i % 100 != 0));
            if (isLeapYear) {
                System.out.println(i);  //Prints the value of i (leap year) every time a leap year is found.
                foundSome = true; // Boolean foundSome here is redundant. Name clarifies it's specific use.
                counter++;        // Counter can also be used to see if 0 leap years were found. Name clarifies it's use.
            }
        }
        if (!foundSome) { // Tests if 0 leap years were found. e.g. startYear == 1 && endYear == 3. Alternative = (if (counter != 0))
            System.out.println("No Leap years were found");
        } else {
        System.out.printf("\n%d Leap Years were found\n", counter); //Counts the number of total leap years found.
        }
    }

    /**
     * Prints a Menu of all the choices
     * that the user can input.
     */
    public static void printMenu() {

        System.out.println("\nMenu");
        System.out.println("1. Find all Leap years");
        System.out.println("2. Find if target year is a leap one");
        System.out.println("3. Exit");
    }

    /**
     * User inputs an integer for choice on menu printed
     * if the choice is not valid
     * User must input a valid one between 1 and 3.
     * @param in    User input integer.
     * @return
     */
    public static int choice(Scanner in) {

        int choice;
        do {
            choice = in.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice < 1 || choice > 3);
        return choice;
    }

    /**
     * Saves two integers input by the User
     * in an array.
     * Returns the array.
     * @param in    The starting and the ending Year.
     * @return      An array containing both values.
     */
    public static int[] yearValues (Scanner in){
        int[] years = {0,0};
        System.out.println("Insert starting year");
        years[0] = in.nextInt();
        System.out.println("Insert end year");
        years[1] = in.nextInt();
        return years;
    }

    /**
     * User inputs an integer for Year.
     * Calculates if the input integer
     * is a Leap year or not.
     * @param in    The year the user wants to calculate.
     */
    public static void leapYearFinder (Scanner in) {
        int year = 0;
        boolean isLeapYear = false;
        System.out.println("Please enter a Year");
        year = in.nextInt();
        isLeapYear = ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear) {
            System.out.printf("The year %d is a Leap Year\n", year);
        } else {
            System.out.printf("The year %d is not a Leap Year\n", year);
        }
    }
}
