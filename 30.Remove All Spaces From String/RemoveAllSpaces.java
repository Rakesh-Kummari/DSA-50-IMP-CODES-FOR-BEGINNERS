import java.util.*;

public class RemoveAllSpaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().trim();

        name = name.replace(" ", "");
        System.out.println(name);
    }
}