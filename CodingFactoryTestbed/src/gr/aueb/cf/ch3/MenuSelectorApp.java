package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User must input an integer between 1-5
 * Otherwise the app asks for a correct input
 * until given
 */
public class MenuSelectorApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menuNum = 0;
        System.out.println("Please choose a section");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
        // menuNum = in.nextInt();
        while ((menuNum = in.nextInt()) <=0 || menuNum > 5) {
            System.out.println("Please insert a valid selection! (1-5)");
        }
        System.out.printf("\nYou chose: %d", menuNum);
        System.out.println("\nThanks for using the app!");
    }
}