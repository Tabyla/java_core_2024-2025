package Lb7.irl.Task4;

class SubClass1 extends SuperClass {
    public String field2;

    public SubClass1(char field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    public SubClass1(SubClass1 other) {
        super(other);
        this.field2 = other.field2;
    }

    @Override
    public String toString() {
        return "SubClass1: " + super.toString() + ", field2 = " + field2;
    }
}