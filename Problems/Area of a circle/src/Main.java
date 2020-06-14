import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float r = scanner.nextFloat();
            System.out.println(Math.PI * r * r);
        }
    }
}
