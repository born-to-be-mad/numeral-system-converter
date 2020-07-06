import java.util.Scanner;

class ConvertingAndMultiplying {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String next = scanner.nextLine();
            while (!"0".equalsIgnoreCase(next)) {

                try {
                    int res = Integer.parseInt(next) * 10;
                    System.out.println(res);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid user input: " + next);
                }

                next = scanner.nextLine();
            }
        }
    }
}
