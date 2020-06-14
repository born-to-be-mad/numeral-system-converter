//put imports you need here

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;
            List<String> persons = new ArrayList<>();
            while (i++ < 4) {
                persons.addAll(Arrays.asList(scanner.nextLine().split(" ")));
            }
            Collections.reverse(persons);
            persons.forEach(System.out::println);
        }
    }
}
