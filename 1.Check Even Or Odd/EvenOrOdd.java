import java.util.*;

public class EvenOrOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int n = sc.nextInt();
        int temp = n;

        System.out.print((n % 2 == 0) ? "Even = " : "Odd = ");
        System.out.println(temp);
    }
}