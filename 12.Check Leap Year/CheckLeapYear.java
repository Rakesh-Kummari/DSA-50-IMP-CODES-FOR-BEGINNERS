import java.util.*;

public class CheckLeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int temp = year;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year: " + temp);
        } else {
            System.out.println("Not Leap Year: " + temp);
        }
    }
}