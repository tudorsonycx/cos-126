package textbook.ch1.sec2.exercises.ex5;

public class Xor {
    public static void main(String[] args) {
        boolean a;
        boolean b;

        a = false;
        b = false;
        boolean result = (a && !b) || (!a && b); // xor operation; expanded version of ^

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = false;
        b = true;
        result = a ^ b;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = true;
        b = false;
        result = a ^ b;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = true;
        b = true;
        result = a ^ b;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);
    }
}
