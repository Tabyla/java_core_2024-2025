package Laba1.irl;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели: ");
        String day = scanner.nextLine();

        System.out.print("Введите текущий месяц: ");
        String month = scanner.nextLine();

        System.out.print("Введите число: ");
        int date = scanner.nextInt();

        System.out.printf("%s, %d, %s", day, date, month);
        scanner.close();
    }
}
