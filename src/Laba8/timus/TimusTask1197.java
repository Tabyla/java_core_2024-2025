package Lb8;

import java.util.Scanner;

public class TimusTask1197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moves = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < moves; i++) {
            String position = sc.nextLine();
            int x = position.charAt(0) - 'a' + 1;  // Преобразуем букву в число
            int y = position.charAt(1) - '0';      // Преобразуем цифру

            int[][] knightMoves = {
                    {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                    {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
            };

            int validMoves = 0;
            for (int[] move : knightMoves) {
                int newX = x + move[0];
                int newY = y + move[1];
                if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                    validMoves++;
                }
            }

            System.out.println(validMoves);
        }
    }
}
