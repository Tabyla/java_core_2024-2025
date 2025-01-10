package Lb7.irl.Task3;

class SubClass2 extends SubClass1 {
    public String field3;

    public SubClass2(int field1, char field2, String field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public void setFields(int field1, char field2, String field3) {
        super.setFields(field1, field2);
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return "SubClass2: " + super.toString() + ", field3 = " + field3;
    }
}
