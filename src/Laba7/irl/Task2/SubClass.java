package Lb7.irl.Task2;

class SubClass extends SuperClass {
    public int field2;

    public SubClass(String field1, int field2) {
        super(field1);
        this.field2 = field2;
    }

    public void setField1() {
        super.setField1("Default");
    }

    public void setField1(String field1) {
        super.setField1(field1);
    }

    public void setField1(int field2) {
        this.field2 = field2;
    }

    public void setField1(String field1, int field2) {
        super.setField1(field1);
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "SubClass: " + super.toString() + ", field2 = " + field2;
    }
}
