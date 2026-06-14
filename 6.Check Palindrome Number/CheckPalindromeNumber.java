import java.util.*;

public class CheckPalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int rev = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            rev = lastDigit + rev * 10;
            n = n / 10;
        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}