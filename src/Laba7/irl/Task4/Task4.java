package Lb7.irl.Task4;

public class Task4 {
    public static void main(String[] args) {
        SubClass2 original = new SubClass2('C', "Test", 123);
        System.out.println("Original: " + original);

        SubClass2 copy = new SubClass2(original);
        System.out.println("Copy: " + copy);
    }
}
