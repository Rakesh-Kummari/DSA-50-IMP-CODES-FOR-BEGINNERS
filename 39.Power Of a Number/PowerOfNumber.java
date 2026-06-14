import java.util.*;

public class PowerOfNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int exp = sc.nextInt();
        int base = sc.nextInt();

        long sum = 1;
        for (int i = 1; i <= exp; i++) {
            sum = sum * base;

        }

        System.out.println(sum);

        // Direct Math Function to Calculate Power
        // System.out.println(Math.pow(base, exp));

    }
}