import java.util.*;

public class CheckSubString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String sub = sc.next();

        if (str.contains(sub)) {
            System.err.println("yes Sub String Present");
        } else {
            System.out.println("Not Present Sub String!");
        }
    }
}