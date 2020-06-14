import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int amountOfPositives = 0;

        while (i++ < 3) {
            if (scanner.nextInt() > 0) {
                amountOfPositives++;
            }
            if (amountOfPositives > 1) {
                break;
            }

        }
        System.out.println(amountOfPositives == 1);

        scanner.close();
    }
}
