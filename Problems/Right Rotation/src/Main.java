import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String arrayOfNumbers = scanner.nextLine();
            int numberOfRotations = scanner.nextInt();
            String[] items = arrayOfNumbers.split(" ");
            String[] newItems = new String[items.length];
            numberOfRotations = numberOfRotations % items.length;
            System.arraycopy(items, 0, newItems, numberOfRotations, items.length - numberOfRotations);
            System.arraycopy(items, items.length - numberOfRotations, newItems, 0, numberOfRotations);
            for (String item : newItems) {
                System.out.print(item + " ");
            }
        }
    }
}
