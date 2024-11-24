package Laba5.irl;

import java.util.Scanner;

public class Task4 {
    private final char charField;
    private final int intField;

    public Task4(int intField, char charField) {
        this.charField = charField;
        this.intField = intField;
    }

    public Task4(double value) {
        int charCode = (int) value;
        this.charField = (char) charCode;

        double fractionalPart = value - charCode;
        this.intField = (int) (fractionalPart * 100);
    }

    public void display() {
        System.out.println("Символьное поле: " + charField);
        System.out.println("Целочисленное поле: " + intField);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число для первого объекта:");
        int intValue = scanner.nextInt();
        System.out.println("Введите символ для первого объекта:");
        char charValue = scanner.next().charAt(0);

        Task4 pair1 = new Task4(intValue, charValue);
        System.out.println("Первый объект:");
        pair1.display();

        System.out.println("Введите значение типа double для второго объекта:");
        double doubleValue = scanner.nextDouble();

        Task4 pair2 = new Task4(doubleValue);
        System.out.println("Второй объект:");
        pair2.display();

        scanner.close();
    }
}