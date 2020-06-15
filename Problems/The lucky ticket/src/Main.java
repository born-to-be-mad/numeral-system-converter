import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            int sum1 = Arrays.stream(input.substring(0, 3).split("")).mapToInt(Integer::valueOf).sum();
            int sum2 = Arrays.stream(input.substring(3, 6).split("")).mapToInt(Integer::valueOf).sum();
            System.out.println(sum1 == sum2 ? "Lucky" : "Regular");
        }
    }
}
