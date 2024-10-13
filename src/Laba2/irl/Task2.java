package Laba2.irl;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 5 == 2 && num % 7 == 1) {
            System.out.printf("Число %d удовлетворяет критериям", num);
        } else {
            System.out.printf("Число %d не удовлетворяет критериям", num);
        }

        scanner.close();
    }
}
