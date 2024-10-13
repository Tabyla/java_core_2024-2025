package Laba2.irl;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.printf("Число %d делится на 0", num);
        } else {
            System.out.printf("Число %d не делится на 0", num);
        }

        scanner.close();
    }
}
