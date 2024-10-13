package Laba2.irl;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.printf("Число %d попадает в диапазон от 5 до 10 включительно", num);
        } else {
            System.out.printf("Число %d не попадает в диапазон от 5 до 10", num);
        }

        scanner.close();
    }
}
