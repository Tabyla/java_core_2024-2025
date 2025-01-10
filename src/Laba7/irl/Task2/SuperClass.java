package Lb7.irl.Task2;

class SuperClass {
    private String field1;

    public SuperClass(String field1) {
        this.field1 = field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField1Length() {
        return field1.length();
    }

    @Override
    public String toString() {
        return "SuperClass: field1 = " + field1;
    }
}
