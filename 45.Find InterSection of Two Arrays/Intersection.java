import java.util.*;

public class Intersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int n1 = sc.nextInt();

        // Array 1
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Array2
        int arr2[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr2[i] = sc.nextInt();
        }

        // intersection
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}