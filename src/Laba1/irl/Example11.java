package Laba1.irl;

import java.time.Year;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваш год рождения: ");
        int year = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - year;

        System.out.printf("%s, Вам %d лет", name, age);
        scanner.close();
    }
}
