import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String line1;
        String line2;
        try (Scanner scanner = new Scanner(System.in)) {
            line1 = scanner.nextLine();
            line2 = scanner.nextLine();
        }

        System.out.println(line2);
        System.out.println(line1);
    }
}
