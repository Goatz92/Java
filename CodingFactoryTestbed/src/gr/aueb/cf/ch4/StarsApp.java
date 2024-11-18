package gr.aueb.cf.ch4;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * User inputs a n integer for stars
 * and prints:
 * n horizontal stars
 * n vertical stars
 * n * n stars in a table
 * 1 to n stars
 * n to 1 stars
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stars = 0;
        int choice = 0;

        do {
            printMenu();
            choice = choice(in);
            switch (choice) {
                case 1:
                    System.out.println("\nPlease enter the number of stars\n");
                    starsLine(in);
                    break;
                case 2:
                    System.out.println("\nPlease enter the number of stars\n");
                    starsVertical(in);
                    break;
                case 3:
                    System.out.println("\nPlease enter the number of stars\n");
                    starsBox(in);
                    break;
                case 4:
                    System.out.println("\nPlease enter the number of stars\n");
                    starsAscending(in);
                    break;
                case 5:
                    System.out.println("\nPlease enter the number of stars\n");
                    starsDescending(in);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 6);
    }
    public static void printMenu() {
        System.out.println("\n\nChoose one:");
        System.out.println("1. Stars in horizontal line.");
        System.out.println("2. Stars in vertical line.");
        System.out.println("3. Stars in box shape");
        System.out.println("4. Stars from one to choice in different lines");
        System.out.println("5. Stars from choice to one in different lines");
        System.out.println("6. Exit\n");
    }

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

    public static int starsCount(Scanner in) {

        int stars;
        stars = in.nextInt();
        return stars;
    }

    public static void starsLine (Scanner in) {

        int stars = starsCount(in);

        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }
    public static void starsVertical (Scanner in) {

        int stars = starsCount(in);
        for (int i = 1; i <= stars; i++)
            System.out.println("*");
    }

    public static void starsBox (Scanner in) {
        int stars = starsCount(in);
        for (int i = 1; i <= stars; i++) {
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void starsAscending (Scanner in) {

        int stars = starsCount(in);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starsDescending (Scanner in) {

        int stars = starsCount(in);
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

