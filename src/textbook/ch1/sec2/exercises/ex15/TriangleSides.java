package textbook.ch1.sec2.exercises.ex15;

public class TriangleSides {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isAGreater = a >= b + c;
        boolean isBGreater = b >= a + c;
        boolean isCGreater = c >= a + b;

        boolean isTriangle = !(isAGreater || isBGreater || isCGreater);

        System.out.println(isTriangle);
    }
}
