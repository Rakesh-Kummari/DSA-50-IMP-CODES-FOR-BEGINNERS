import java.util.*;

public class RemoveCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char c = sc.next().charAt(0);

        str = str.replace(Character.toString(c), "");
        System.out.println(str);
    }
}