package gr.aueb.cf.ch6;

import java.util.Random;
import java.util.Scanner;

public class ArrMethodsApp {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        final int LOWER = 0;
        final int HIGHER = 100;
        final int ARRAY_SIZE = 6;
        int inputInt = 0;
        int[] arr = new int[ARRAY_SIZE];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(LOWER,HIGHER);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPlease insert an int");
        inputInt = in.nextInt();
        if (findPosition(arr, inputInt) == -1) {
            System.out.println("The number: " + inputInt + ", was not found");
        } else {
            System.out.printf("The number %d is in position %d\n", inputInt, findPosition(arr, inputInt));
        }
        evenNumber(arr);
        System.out.println("There is at least one positive: " + isAtLeastOnePositive(arr));
        System.out.println("All numbers are positive: " + allArePositive(arr));
    }

    public static int findPosition (int[] arr, int inputInt) {

        int position = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == inputInt) {
                position = i;
                break;
            }
        }
        return position;
    }

    public static void evenNumber (int[] arr) {

        System.out.println("The Even numbers are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " \n");
            }
        }
    }

    public static int[] mapToDouble (int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static boolean isAtLeastOnePositive (int[] arr) {
        boolean isPositive = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                isPositive = true;
                break;
            }
        }
        return isPositive;
    }

    public static boolean allArePositive (int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0) {
                count++;
            }
        }
        return count == arr.length;
    }
}
