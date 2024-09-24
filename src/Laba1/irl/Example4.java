package Laba1.irl;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        System.out.println("Ваше число: " + num);
        scanner.close();
    }
}
