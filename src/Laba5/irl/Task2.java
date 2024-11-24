package Laba5.irl;

public class Task2 {
    private final char startChar;
    private final char endChar;

    public Task2(char startChar, char endChar) {
        this.startChar = startChar;
        this.endChar = endChar;
    }

    public void printCharRange() {
        char lower = (char) Math.min(startChar, endChar);
        char upper = (char) Math.max(startChar, endChar);

        System.out.print("Символы в диапазоне: ");
        for (char c = lower; c <= upper; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Task2 charRange = new Task2('A', 'D');

        charRange.printCharRange();

        Task2 charRange2 = new Task2('d', 'a');
        charRange2.printCharRange();
    }
}