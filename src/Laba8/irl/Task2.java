package Lb8;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Открываем файл для чтения с указанием кодировки UTF-8
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\MyFile1.txt"), "UTF-8"));

            // Открываем файл для записи с указанием кодировки UTF-8
            writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\MyFile2.txt"), "UTF-8"));

            String line;
            int lineNumber = 1;

            // Чтение файла построчно
            while ((line = reader.readLine()) != null) {
                // Записываем в выходной файл номер строки и её содержимое
                writer.write(lineNumber + ": " + line);
                writer.newLine(); // Переход на новую строку
                lineNumber++;
            }

            System.out.println("Файл успешно обработан и записан в MyFile2.txt");

        } catch (IOException e) {
            // Обработка ошибок ввода-вывода
            System.err.println("Произошла ошибка при работе с файлами: " + e.getMessage());
        } finally {
            try {
                // Закрываем потоки
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файловых потоков: " + e.getMessage());
            }
        }
    }
}
