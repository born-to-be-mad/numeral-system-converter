//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String name = scanner.next();
            int age = scanner.nextInt();
            String stageOfEducation = scanner.next();
            int yearsExperience = scanner.nextInt();
            String cuisinePreference = scanner.next();
            System.out.printf(
                "The form for %s is completed. We will contact you if we need a chef that cooks %s dishes.",
                name,
                cuisinePreference);
        }


    }
}
