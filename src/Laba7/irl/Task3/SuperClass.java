package Lb7.irl.Task3;

class SuperClass {
    public int field1;

    public SuperClass(int field1) {
        this.field1 = field1;
    }

    public void setFields(int field1) {
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "SuperClass: field1 = " + field1;
    }
}
