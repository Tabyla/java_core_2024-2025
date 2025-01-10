package Lb7.irl.Task1;

public class Task1 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Value1");
        System.out.println(superClass);

        SubClass subClass1 = new SubClass("Value1");
        System.out.println(subClass1);

        SubClass subClass2 = new SubClass("Value1", "Value2");
        System.out.println(subClass2);
    }
}