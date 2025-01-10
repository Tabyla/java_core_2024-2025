package Lb7.irl.Task4;

class SuperClass {
    public char field1;

    public SuperClass(char field1) {
        this.field1 = field1;
    }

    public SuperClass(SuperClass other) {
        this.field1 = other.field1;
    }

    @Override
    public String toString() {
        return "SuperClass: field1 = " + field1;
    }
}