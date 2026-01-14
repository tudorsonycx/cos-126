package textbook.ch1.sec2.webexercises.wex1;

public class Swap {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int t = a;
        System.out.println("t = " + t);

        a = b;
        System.out.println("a = " + a);

        b = t;
        System.out.println("b = " + b);
    }
}
