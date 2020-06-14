package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sourceRadix = scanner.nextInt();
            String number = scanner.next();
            int targetRadix = scanner.nextInt();
            int decimalNumber = 0;
            if (sourceRadix == 1) {
                decimalNumber = number.length();
            } else if (sourceRadix == 10) {
                decimalNumber = Integer.parseInt(number);
            } else {
                decimalNumber = Integer.parseInt(number, sourceRadix);
            }

            String targetNumber = "";
            if (targetRadix >= Character.MIN_RADIX && targetRadix <= Character.MAX_RADIX) {
                targetNumber = Integer.toString(decimalNumber, targetRadix);
            } else if (targetRadix == 1) {
                targetNumber = "1".repeat(decimalNumber);
            }
            System.out.println(targetNumber);
        }
    }
}
