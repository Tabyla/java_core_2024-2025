package Lb7.irl.Task2;

public class Task2 {
    public static void main(String[] args) {
        SubClass subClass = new SubClass("Text", 42);
        System.out.println(subClass);

        subClass.setField1();
        System.out.println(subClass);

        subClass.setField1("New Text", 99);
        System.out.println(subClass);
    }
}