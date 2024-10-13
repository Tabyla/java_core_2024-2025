package Laba2.irl;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int thousands = (num / 1000) % 10;

        System.out.println("Тысяч в Вашем числе: " + Math.abs(thousands));

        scanner.close();
    }
}
