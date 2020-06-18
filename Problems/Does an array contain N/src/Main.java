import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            int i = 0;
            while (i++<size){
            String[] input = scanner.nextLine().split(" ");
            int n = scanner.nextInt();
            System.out.println(Arrays.stream(input).anyMatch(s -> Integer.parseInt(s) == n));
        }
    }
}
