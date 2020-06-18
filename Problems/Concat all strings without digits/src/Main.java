import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            for (String s : str.split("")) {
                if (!Character.isDigit(s.charAt(0))) {
                    stringBuilder.append(s);
                }
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
