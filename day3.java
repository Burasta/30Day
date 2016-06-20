// Score: 30/30

import java.util.*;

public class day3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Your integer: ");
        int n = scan.nextInt();
        scan.close();
        String ans="Not Weird";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if((n % 2 == 1) || (n >= 6 && n <= 20)){
            ans = "Weird";
        }
        else{
            // Complete the code
        }
        System.out.println(ans);
    }
}