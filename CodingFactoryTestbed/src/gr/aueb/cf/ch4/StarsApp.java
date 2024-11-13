package gr.aueb.cf.ch4;

import java.util.Scanner;

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
        System.out.println("Please insert the number of stars");
        stars = in.nextInt();
        printMenu();
        choice = in.nextInt();

        switch (choice) {
            case 1:
                for (int i = 1; i <= stars; i++)
                    System.out.print("*");
                break;
            case 2:
                for (int i = 1; i <= stars; i++)
                    System.out.println("*");
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }

    public static void printMenu() {
        System.out.println("Choose one:");
        System.out.println("1. Create");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }
}

