package Laba5.irl;

import java.util.Scanner;
import java.util.Random;

public class Task3 {
    private final int firstNumber;
    private final int secondNumber;

    public Task3() {
        Random random = new Random();
        this.firstNumber = random.nextInt(101);
        this.secondNumber = random.nextInt(101);
    }

    public Task3(int firstNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = new Random().nextInt(101);
    }

    public Task3(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void printInfo() {
        System.out.println("Первое число: " + firstNumber + ", Второе число: " + secondNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите, какой конструктор использовать:");
        System.out.println("1 - Ввести два числа");
        System.out.println("2 - Ввести одно число (второе случайное)");
        System.out.println("3 - Использовать случайные значения для обоих чисел");

        int choice = scanner.nextInt();

        Task3 pair;

        switch (choice) {
            case 1 -> {
                System.out.println("Введите первое число:");
                int firstNumber = scanner.nextInt();
                System.out.println("Введите второе число:");
                int secondNumber = scanner.nextInt();
                pair = new Task3(firstNumber, secondNumber);
            }
            case 2 -> {
                System.out.println("Введите первое число:");
                int firstNumber = scanner.nextInt();
                pair = new Task3(firstNumber);
            }
            case 3 -> {
                pair = new Task3();
            }
            default -> {
                System.out.println("Неверный выбор, используются случайные значения.");
                pair = new Task3();
            }
        }

        System.out.println("Создан объект:");
        pair.printInfo();
    }
}

