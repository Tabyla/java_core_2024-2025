package timus.task_1000;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a + b;

        printWriter.println(result);
        printWriter.flush();
    }
}
