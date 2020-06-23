package converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Character> symbols = new HashMap<>();

    static {
        for (int i = 'a', j = 10; i < 'x'; i++, j++)
            symbols.put(String.valueOf(j), (char) i);
    }


    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sourceRadix = scanner.nextInt();
            String input = scanner.next();
            int targetRadix = scanner.nextInt();

            String[] strings = input.split("\\.");
            String targetIntegerPart = convertIntegerPart(sourceRadix, strings[0], targetRadix);
            String targetFractionalNumber = targetRadix > 1 && strings.length > 1
                    ? convertFractionalPart(sourceRadix, strings[1], targetRadix)
                    : "";
            System.out.println(targetIntegerPart + "." + targetFractionalNumber);
        }
    }

    private static String convertFractionalPart(int sourceRadix, String input, int targetRadix) {
        StringBuilder sb = new StringBuilder();
        String temp = input;
        double res = 0;

        int i = sourceRadix;
        for (String s : temp.split("")) {
            res = res + (double) asDecimalNumber(s, sourceRadix) / i;
            i *= sourceRadix;
        }

        temp = Double.toString(res);
        for (i = 0; i < temp.length() && i < 5; i++) {
            String[] split = String.valueOf(Double.parseDouble(temp) * targetRadix).split("\\.");
            String symbol = split[0];
            sb.append(symbol.length() > 1 ? symbols.get(symbol) : symbol);
            temp = "0." + split[1];
        }
        return sb.toString();
    }

    private static String convertIntegerPart(int sourceRadix, String integerPart, int targetRadix) {
        int decimalNumber = asDecimalNumber(integerPart, sourceRadix);

        String targetNumber = "";
        if (targetRadix >= Character.MIN_RADIX && targetRadix <= Character.MAX_RADIX) {
            targetNumber = Integer.toString(decimalNumber, targetRadix);
        } else if (targetRadix == 1) {
            targetNumber = "1".repeat(decimalNumber);
        }
        return targetNumber;
    }

    private static int asDecimalNumber(String integerPart, int sourceRadix) {
        int decimalNumber;
        if (sourceRadix == 1) {
            decimalNumber = integerPart.length();
        } else if (sourceRadix == 10) {
            decimalNumber = Integer.parseInt(integerPart);
        } else {
            decimalNumber = Integer.parseInt(integerPart, sourceRadix);
        }
        return decimalNumber;
    }
}
