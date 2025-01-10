package Lb7.irl.Task1;

class SubClass extends SuperClass {
    private String field2;

    public SubClass(String field1) {
        super(field1);
    }

    public SubClass(String field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "SubClass: " + super.toString() + ", field2 = " + field2;
    }
}
