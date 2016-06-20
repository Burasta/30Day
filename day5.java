// Score: 30/30

import java.util.*;

public class day5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        // Next line needs to be edited out if running it for submission on HackerRank.
        System.out.println("What integer would you like to use?");
        int n = input.nextInt();
        input.close();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}