import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = Integer.parseInt(scanner.nextLine());
            List<String> numbers = Arrays.asList(scanner.nextLine().split(" "));
            if (numbers.size() != size) {
                System.out.println("false");
            } else {
                System.out.println(numbers.containsAll(Arrays.asList(scanner.nextLine().split(" "))));
            }
        }
    }
}
