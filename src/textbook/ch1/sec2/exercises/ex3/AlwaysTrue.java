package textbook.ch1.sec2.exercises.ex3;

public class AlwaysTrue {
    public static void main(String[] args) {
        boolean a;
        boolean b;

        a = false;
        b = false;

        boolean firstHalf = !(a && b) && (a || b);
        boolean secondHalf = (a && b) || !(a || b);
        boolean result = firstHalf || secondHalf;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = false;
        b = true;

        firstHalf = !(a && b) && (a || b);
        secondHalf = (a && b) || !(a || b);
        result = firstHalf || secondHalf;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = true;
        b = false;

        firstHalf = !(a && b) && (a || b);
        secondHalf = (a && b) || !(a || b);
        result = firstHalf || secondHalf;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);

        a = true;
        b = true;

        firstHalf = !(a && b) && (a || b);
        secondHalf = (a && b) || !(a || b);
        result = firstHalf || secondHalf;

        System.out.println("a = " + a + ", b = " + b + ", result = " + result);
    }
}
