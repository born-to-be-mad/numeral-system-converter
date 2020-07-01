import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(scanner.next());
            }

        }
    }
}
