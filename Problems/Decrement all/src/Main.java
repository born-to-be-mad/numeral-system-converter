import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] numbers;
        try (Scanner scanner = new Scanner(System.in)) {
            numbers = new int[4];
            int i = 0;
            while (i++ < 4) {
                numbers[i - 1] = scanner.nextInt();
            }
        }
        for (int number : numbers) {
            System.out.printf("%s ", number - 1);
        }

    }
}
