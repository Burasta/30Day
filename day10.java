import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class day10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(count1(base2(n)));

    }

    private static String base2(int n) {

        ArrayList<String> binary = new ArrayList<>();
        while (n > 0) {
            if (n % 2 == 0) {
                binary.add("0");
            } else {
                binary.add("1");
            }
            n = (n / 2);
        }
        Collections.reverse(binary);
        return binary.toString().replace(", ", "").replace("[", "").replace("]", "");
    }

    private static int count1(String s) {

        String[] ones = s.split("0");
        int highest = 0;
        for (String string : ones) {
            if (string.length() > highest) {
                highest = string.length();
            }
        }
        return highest;
    }
}