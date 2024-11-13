package gr.aueb.cf.testing;

import java.util.Scanner;

/**
 *
 */
public class MilageCostCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kilometers = 0;
        double litersPerhundredkm = 0;
        double gasPrice = 0.0;
        double cost = 0.0;
        System.out.println("How many KM will you travel");
        kilometers = in.nextInt();
        System.out.println("What is the price of Gas");
        gasPrice = in.nextDouble();
        System.out.println("What is L/100 KM of your car");
        litersPerhundredkm = in.nextDouble();
        cost = ((kilometers / 100) * (litersPerhundredkm) * (gasPrice));
        System.out.printf("Your trip will cost: %.2f €", cost);

    }
}
