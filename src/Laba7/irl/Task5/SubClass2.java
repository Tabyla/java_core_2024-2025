package Lb7.irl.Task5;

class SubClass2 extends SuperClass {
    protected char field3;

    public SubClass2(String field1, char field3) {
        super(field1);
        this.field3 = field3;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("SubClass2: field3 = " + field3);
    }
}
