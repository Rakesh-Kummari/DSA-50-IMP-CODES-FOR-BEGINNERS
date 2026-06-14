import java.util.*;

public class StrongNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + factorial(lastDigit);
            n = n / 10;
        }

        System.out.println(temp == sum ? "Strong number" : "Not Strong Number");
    }
}