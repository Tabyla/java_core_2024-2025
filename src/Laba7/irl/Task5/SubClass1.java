package Lb7.irl.Task5;

class SubClass1 extends SuperClass {
    protected int field2;

    public SubClass1(String field1, int field2) {
        super(field1);
        this.field2 = field2;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("SubClass1: field2 = " + field2);
    }
}