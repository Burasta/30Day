// Score: 30/30

import java.util.Scanner;

public class day02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base meal cost: ");
        double mealCost = scan.nextDouble(); // original meal price
        System.out.print("Tip percent: ");
        int tipPercent = scan.nextInt(); // tip percentage
        System.out.print("Tax percent: ");
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double taxed = (mealCost * taxPercent);
        double tipped = (mealCost * tipPercent);
        double sum = (((mealCost * 100) + taxed + tipped) / 100.0);

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(sum);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}