import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int i = 0;
        while (i++ < 4) {
            numbers[i - 1] = scanner.nextInt();
        }
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
