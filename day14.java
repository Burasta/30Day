/*
Score: 30/30
The section denoted with comments in the Difference class is the only thing you need to put into the HackerRank editor. The rest is here for running it locally.
*/

import java.util.*;

public class day14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {

    int maximumDifference;
    private int[] elements;

    // Beginning of 'Needed Code'
    Difference(int[] a) {
        this.elements = a;
    }

    void computeDifference() {

        int max = 0;
        int min = 8675309;
        for (int a : this.elements) {
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
        }

        this.maximumDifference = (max - min);
    }
    // End of 'Needed Code'
}
