import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String source = scanner.nextLine();
            String dest = scanner.nextLine();
            System.out.println(
                source.replaceAll(" ", "")
                      .equals(dest.replaceAll(" ", "")));
        }
    }
}
