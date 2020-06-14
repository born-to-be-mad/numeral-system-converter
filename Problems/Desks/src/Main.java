import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int i = 0;
        while (i++ < 3) {
            numbers.add(scanner.nextInt());
        }
        System.out.println(numbers.stream().mapToInt(num -> (num + 1) / 2).sum());

    }
}
