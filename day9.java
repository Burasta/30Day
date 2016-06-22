import java.util.Scanner;

public class day9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(factorial(input.nextInt()));
        input.close();

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
