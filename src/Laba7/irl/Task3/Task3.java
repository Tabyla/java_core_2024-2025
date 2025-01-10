package Lb7.irl.Task3;

public class Task3 {
    public static void main(String[] args) {
        SubClass2 subClass2 = new SubClass2(10, 'A', "Hello");
        System.out.println(subClass2);

        subClass2.setFields(20, 'B', "World");
        System.out.println(subClass2);
    }
}