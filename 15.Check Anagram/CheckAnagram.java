import java.util.*;

public class CheckAnagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        char arr[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr, arr2) ? "Annagram" : "Not Annagram");
    }
}