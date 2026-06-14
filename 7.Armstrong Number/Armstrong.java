import java.util.*;

public class Armstrong {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit * lastDigit * lastDigit;
            n = n / 10;
        }

        System.out.println(temp == sum ? "ArmStrong Number" : "Not ArmStrong Number");
    }
}