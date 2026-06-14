import java.util.*;

public class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String Binary = sc.next();
        int decimal = 0;
        int power = 0;

        for (int i = Binary.length() - 1; i >= 0; i--) {
            if (Binary.charAt(i) == '1') {
                decimal = decimal + (int) Math.pow(2, power);
            }
            power++;
        }
        System.out.println(decimal);
    }
}