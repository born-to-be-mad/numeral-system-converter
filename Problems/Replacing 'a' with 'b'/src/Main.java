import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.next();
            System.out.println(input.replaceAll("a", "b"));
        }
    }
}
