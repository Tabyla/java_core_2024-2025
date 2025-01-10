package Lb7.irl;

public class Example1 {
    private String str1;

    public Example1(String strEx) {
        this.str1 = strEx;
    }

    public Example1() {
    }

    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() +
                "\n" + " str1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
