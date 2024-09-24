package Laba1.irl;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int firstNum = num - 1;
        int thirdNum = num + 1;
        int sum = firstNum + num + thirdNum;
        double fourthNum = Math.pow(sum, 2);

        System.out.printf("%d, %d, %d, %.2f", firstNum, num, thirdNum, fourthNum);
        scanner.close();
    }
}
