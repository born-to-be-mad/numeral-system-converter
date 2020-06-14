import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float first = scanner.nextFloat();
            float second = scanner.nextFloat();

            System.out.println(second - first);
        }
    }
}
