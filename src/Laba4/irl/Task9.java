package Laba4.irl;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String customAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя0123456789 .,!?";

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();
        scanner.nextLine();

        String encryptedText = encrypt(inputText, key, customAlphabet);
        System.out.println("Текст после преобразования: " + encryptedText);

        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("y")) {
                String decryptedText = decrypt(encryptedText, key, customAlphabet);
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

    public static String encrypt(String text, int key, String alphabet) {
        StringBuilder encrypted = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (char c : text.toCharArray()) {
            int index = alphabet.indexOf(c);

            if (index != -1) {
                int newIndex = (index + key) % alphabetLength;
                if (newIndex < 0) {
                    newIndex += alphabetLength;
                }
                encrypted.append(alphabet.charAt(newIndex));
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String text, int key, String alphabet) {
        return encrypt(text, -key, alphabet);
    }
}
