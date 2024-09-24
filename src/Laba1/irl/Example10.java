package Laba1.irl;

import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваш год рождения: ");
        int year = scanner.nextInt();

        int currentYear = Year.now().getValue();
        int age = currentYear - year;

        System.out.printf("Вам %d лет", age);
        scanner.close();
    }
}
