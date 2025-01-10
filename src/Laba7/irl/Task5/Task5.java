package Lb7.irl.Task5;

public class Task5 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Super");
        superClass.display();

        SuperClass subClass1 = new SubClass1("Sub1", 42);
        subClass1.display();

        SuperClass subClass2 = new SubClass2("Sub2", 'A');
        subClass2.display();
    }
}
