// Score: 30/30

import java.util.*;

public class day6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        int cases = input.nextInt();
        String[] strings = new String[cases];

        for (int i = 0; i < cases; i++) {
            strings[i] = input.next();
        }
        for (int i = 0; i < strings.length; i++) {
            String even = "";
            String odd = "";
            for (int j = 0; j < strings[i].length(); j++) {
                if (j % 2 == 0){
                    even += strings[i].charAt(j);
                } else {
                    odd += strings[i].charAt(j);
                }

            }
            System.out.println(even + " " + odd);
        }
    }
}