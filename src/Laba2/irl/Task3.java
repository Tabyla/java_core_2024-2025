package Laba2.irl;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        if (num % 4 == 0 && num >= 10) {
            System.out.printf("Число %d удовлетворяет критериям", num);
        } else {
            System.out.printf("Число %d не удовлетворяет критериям", num);
        }

        scanner.close();
    }
}
