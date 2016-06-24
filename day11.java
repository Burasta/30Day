// Score: 30/30

import java.lang.Integer;
import java.util.Scanner;

public class day11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        String s = input.next();
        String[] first = s.split(" ");
        int length = first.length;
        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            matrix[0][i] = Integer.parseInt(first[i]);
        }

        for (int i = 1; i < length; i++) {
            String[] line = input.next().split(" ");
            for (int j = 0; j < length; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        input.close();

        int max = 8675309;

        for (int i = 0; i < length - 2; i++) {
            for (int j = 0; j < length - 2; j++) {
                int sum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +              // First row of the I-hourglass.
                          matrix[i + 1][j + 1] +                                            // Center row of the I-hourglass.
                          matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];   // Last row of the I-hourglass.
                max = ((max < sum) || (max == 8675309)) ? sum : max;
            }
        }

        System.out.println(max);
    }
}
