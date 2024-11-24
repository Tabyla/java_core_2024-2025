package Laba4.irl;

public class Task4 {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;

        int[][] triangle = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                triangle[i][j] = 2;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
