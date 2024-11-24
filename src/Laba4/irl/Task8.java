package Laba4.irl;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decryptedText = decrypt(encryptedText, key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append((char) ((c - base + key) % 26 + base));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - key % 26);
    }
}
