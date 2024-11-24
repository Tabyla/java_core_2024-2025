package Laba4.irl;

public class Task2 {
    public static void main(String[] args) {
        int figure = 10;
        int i ;
        int j ;
        int z ;

        for (i = 1 ; i <= figure; i++){
            System.out.print(" ");
            z = 0;
            for (j = 1 ; j <= i; j++){
                System.out.print("+");
                z = z + 1;
            }
            System.out.println(" ");
        }
    }
}
