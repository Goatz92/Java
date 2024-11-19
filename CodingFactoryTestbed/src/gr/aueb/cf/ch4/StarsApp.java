package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * User inputs an n integer for stars
 * and prints:
 * n horizontal stars
 * n vertical stars
 * n * n stars in a table
 * 1 to n stars (Ascending)
 * n to 1 stars (Descending)
 */

public class StarsApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int stars = 0;
        int choice;
        menuStatic();
        do {
            printMenu();
            choice = choice(in);
            switch (choice) { //For each case see printMenu Method. For Choice see choice method
                case 1:
                    stars = starsCount(stars);
                    starsLine(stars);
                    break;
                case 2:
                    starsVertical();
                    break;
                case 3:
                    starsBox();
                    break;
                case 4:
                    starsAscending();
                    break;
                case 5:
                    starsDescending();
                    break;
                case 6:
                    System.out.println("Goodbye!"); //Exit State
                    break;
            }
        } while (choice != 6); //Checks for Exit state
    }

    /**
     * Prints a Welcome Menu only once
     */
    public static void menuStatic() {

        System.out.println("-------------------------------");
        System.out.println("Welcome to star printer!");
        System.out.println("-------------------------------\n");
        System.out.println("Here you can print Stars:\n");
        System.out.println("--In a horizontal line--");
        System.out.println("--In a vertical line--");
        System.out.println("--In a box shape (stars * lines)--");
        System.out.println("--One star to number of Stars in Ascending order--");
        System.out.println("--Number of stars to One star in Descending order--");
    }

    /**
     * Prints the Choice menu
     */
    public static void printMenu() {

        System.out.println("\n\nChoose one:");
        System.out.println("1. Stars in horizontal line.");
        System.out.println("2. Stars in vertical line.");
        System.out.println("3. Stars in box shape");
        System.out.println("4. One star to number of Stars in Ascending order");
        System.out.println("5. Number of stars to One star in Descending order");
        System.out.println("6. Exit\n");
    }

    /**
     * Asks the user for a Choice 1-6
     * For choices see printMenu method
     * If Choice is not valid
     * Asks the user for a valid choice (choice < 1 || choice > 6)
     * @param in    User Choice
     * @return      Choice for switch case use in main
     */
    public static int choice(Scanner in) {

        int choice;
        do {
            choice = in.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Please enter a valid choice");
            }
        } while (choice < 1 || choice > 6);
        return choice;
    }

    /**
     * Asks the user for the total number of stars
     * They want to input
     * Then checks if the number is greater than zero
     * by use of 'isNumberOfStarsValid' method
     * If number is lower or equal to zero
     * Asks the user for valid input
     * @param stars     The number of stars the user inputs
     * @return          The total number of stars
     */
    public static int starsCount(int stars) {

        do {
            System.out.println("\nPlease enter the number of stars\n");
            stars = in.nextInt();
            isNumberOfStarsValid(stars); //Checks if number of stars is <= 0.
        } while (stars <= 0);
        return stars;
    }

    /**
     * Asks the user for the total number of lines
     * They want to input
     * Then checks if the number is greater than zero
     * by use of 'isNumberOfLinesValid' method
     * If number is lower or equal to zero
     * Asks the user for valid input
     * ONLY USE is in starsBox method.
     * @param lines    The number of lines the user inputs
     * @return         The total number of lines
     */
    public static int linesCount(int lines) {

        do {
            System.out.println("\nPlease enter the number of Lines\n");
            lines = in.nextInt();
            isNumberOfLinesValid(lines); //Checks if number of lines is <= 0.
        } while (lines <= 0);
        return lines;
    }

    /**
     * Checks if the number of stars
     * input by the user is great than zero
     * @param stars     The number of stars input in starsCount method
     */
    public static void isNumberOfStarsValid (int stars) {
        if (stars <= 0) {
            System.out.println("Number of stars needs to be Greater than Zero!");
            System.out.println("Please try Again!");
            return;
        }
    }

    /**
     * Checks if the number of lines
     * input by the user is great than zero
     * @param lines     The number of lines input in linesCount method
     */
    public static void isNumberOfLinesValid (int lines) {
        if (lines <= 0) {
            System.out.println("Number of Lines needs to be Greater than Zero!");
            System.out.println("Please try Again!");
            return;
        }
    }

    /**
     * Prints out a horizontal line of stars
     * Equal to the number input in starsCount method
     * @param stars     The number of stars to be printed
     */
    public static void starsLine (int stars) {

        for (int i = 1; i <= stars; i++) { //Formula for printing * in a horizontal line.
            System.out.print("*");
        }
    }

    /**
     * Prints out a vertical line of stars
     * Equal to the number input in starsCount method
     */
    public static void starsVertical () {

        int stars = 0;
        stars = starsCount(stars);
        for (int i = 1; i <= stars; i++) //Formula for printing stars in a vertical line.
            System.out.println("*");
    }

    /**
     * Prints out a Box of stars
     * Box dimensions = stars*line
     * The number of stars/line = number of stars input in starsCount method
     * The number of lines = number of lines input in linesCount method
     */
    public static void starsBox () {

        int stars = 0;
        int lines = 0;
        stars = starsCount(stars);
        lines = linesCount(lines);
        for (int i = 1; i <= lines; i++) { //Formula for determining how many lines the box shape will have
            starsLine(stars);{
            }
            System.out.println();
        }
    }

/*
------------------------------------------------------------
Example Method for printing Box (n*n (n = 10 in this example)
------------------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */

    /**
     * Prints rows of stars in ascending order in steps of one
     * Starts from one star.
     * Ends in number of stars input in starsCount method
     */
    public static void starsAscending () {

        int stars = 0;
        stars = starsCount(stars);
        System.out.println();
        for (int i = 1; i <= stars; i++) {
            starsLine(i);
            System.out.println();
        }
        System.out.println();
    }

// -----------------------------------------------------------------------
// Example Method for printing One to number of stars (in Ascending order).
// -----------------------------------------------------------------------
//         int stars = 0;
//         System.out.println("\nPlease enter the number of Stars\n");
//         stars = starsCount(in);
//         System.out.println();
//         for (int i = 1; i <= 10; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

    /**
     * Prints out rows of stars in descending order in steps of one
     * Starts from max number of stars input in starsCount method
     * Ends when it reaches one star.
     */
    public static void starsDescending () {

        int stars = 0;
        stars = starsCount(stars);
        System.out.println();
        for (int i = stars; i >= 0; i--){
            starsLine(i);
            System.out.println();
        }
    }
    // -----------------------------------------------------------------------
    // Example Method for printing number of stars to One (in Descending order).
    // -----------------------------------------------------------------------
    //     int stars = 0;
    //     System.out.println("\nPlease enter the number of Stars\n");
    //     stars = starsCount(in);
    //     System.out.println();
    //     for (int i = 1; i <= 10; i++) {
    //         for (int j = i; j <= 10; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
}


