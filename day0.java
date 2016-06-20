// Score: 30/30

import java.util.Scanner;

public class day0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
        System.out.println("What's your input string?");
        String inputString = scan.nextLine(); // read a line of input and save it to a variable
        scan.close(); // close the scanner

        // Your first line of output goes here
        System.out.println("Hello, World.");

        // Write the second line of output
        System.out.println(inputString);
    }
}