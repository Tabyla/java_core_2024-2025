package Lb7.irl.Task3;

class SubClass1 extends SuperClass {
    public char field2;

    public SubClass1(int field1, char field2) {
        super(field1);
        this.field2 = field2;
    }

    public void setFields(int field1, char field2) {
        super.setFields(field1);
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "SubClass1: " + super.toString() + ", field2 = " + field2;
    }
}
