package Laba1.irl;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        System.out.printf("Вас зовут %s и Вам %d лет", name, age);
        scanner.close();
    }
}
