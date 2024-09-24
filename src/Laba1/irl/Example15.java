package Laba1.irl;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNum = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;

        System.out.printf("Сумма чисел: %d и %d = %d \n", firstNum, secondNum, sum);
        System.out.printf("Разность чисел: %d и %d = %d", firstNum, secondNum, difference);
        scanner.close();
    }
}
