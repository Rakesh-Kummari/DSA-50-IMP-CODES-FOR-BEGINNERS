import java.util.*;

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine().toLowerCase();
    int vowels = 0;
    int consonats = 0;

    for (char ch : str.toCharArray()) {
        if (Character.isLetter(ch)) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonats++;
            }
        }
    }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonates: " + consonats);
}