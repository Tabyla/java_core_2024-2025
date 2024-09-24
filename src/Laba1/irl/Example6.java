package Laba1.irl;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Вашу фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Ваше отчество: ");
        String patronymic = scanner.nextLine();

        System.out.printf("Hello <%s, %s, %s>", surname, name, patronymic);
        scanner.close();
    }
}
