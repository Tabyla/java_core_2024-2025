package Laba1.irl;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();

        System.out.print("Введите количество дней в этом месяце: ");
        int days = scanner.nextInt();

        System.out.printf("%s содержит %d дней.", month, days);
        scanner.close();
    }
}
