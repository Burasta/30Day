// Score: 30/30

import java.util.Scanner;

public class day7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int cases = input.nextInt();
        String[] numbers = input.next().split(" ");
        input.close();

        for (int i = (numbers.length - 1); i > 0; i--) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }

        System.out.println(numbers[0]);

    }
}