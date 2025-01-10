package Lb7.irl.Task4;

class SubClass2 extends SubClass1 {
    public int field3;

    public SubClass2(char field1, String field2, int field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public SubClass2(SubClass2 other) {
        super(other);
        this.field3 = other.field3;
    }

    @Override
    public String toString() {
        return "SubClass2: " + super.toString() + ", field3 = " + field3;
    }
}
