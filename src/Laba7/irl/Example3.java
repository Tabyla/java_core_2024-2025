package Lb7.irl;

public class Example3 {
    public static void main(String[] args) {
        Example1 superClassObject = new Example1("передал в конструктор суперклсса");
        String className = superClassObject.toString();
        System.out.println(className);

        Example2 subClassObject1 = new Example2("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        Example2 subClassObject2 = new Example2("передал в конструктор подкласса", "где 2 параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
