package Laba1.irl;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите Ваш вес: ");
        float height = scanner.nextFloat();

        System.out.printf("Имя: %s; Возраст: %d; Вес: %.2f. \n", name, age, height);
        scanner.close();
    }
}
