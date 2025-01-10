package Lb8;
import java.io.*;
import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        try {
            // Чтение исходного файла
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Files\\classic_text.txt"), "UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Files\\filtered_text.txt"), "UTF-8"));

            String consonants = "бвгджзйклмнпрстфхцчшщ";
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+"); // Ставим пробел
                int consonantWordCount = 0;
                StringBuilder resultLine = new StringBuilder(lineNumber + ": ");

                for (String word : words) {
                    if (word.length() > 0 && consonants.indexOf(Character.toLowerCase(word.charAt(0))) != -1) {
                        resultLine.append(word).append(" ");
                        consonantWordCount++;
                    }
                }

                if (consonantWordCount > 0) {
                    writer.write(resultLine.toString().trim() + " (выбрано слов: " + consonantWordCount + ")");
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();
            System.out.println("Фильтрация завершена. Результат сохранен в filtered_text.txt");

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        }
    }
}
