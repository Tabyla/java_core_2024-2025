package Lb7.irl.Task1;

class SuperClass {
    private String field1;

    public SuperClass(String field1) {
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "SuperClass: field1 = " + field1;
    }
}
