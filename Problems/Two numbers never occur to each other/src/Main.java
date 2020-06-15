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
                String[] search = scanner.nextLine().split(" ");
                String first = search[0];
                String second = search[1];
                int iFirst = -1;
                do {
                    iFirst = (numbers.indexOf(first));
                    int iSecond = -1;
                    do {
                        iSecond = numbers.indexOf(second);
                        if (iSecond - 1 == iFirst) {
                            System.out.println("false");
                            return;
                        }
                    } while (iSecond != -1);
                } while (iFirst != -1);

                System.out.println("true");
            }
        }
    }
}
