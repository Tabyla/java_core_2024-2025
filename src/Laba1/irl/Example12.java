package Laba1.irl;

import java.time.Year;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int year = currentYear - age;

        System.out.printf("Вы %d года рождения", year);
        scanner.close();
    }
}
