import java.util.*;

public class CountWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
        } else {
            String worlds[] = str.split(" ");
            System.out.println(worlds.length);
        }
    }
}