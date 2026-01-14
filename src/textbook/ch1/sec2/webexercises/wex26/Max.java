package textbook.ch1.sec2.webexercises.wex26;

public class Max {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // this trick works because abs(a - b) = a - b if a >= b or b - a if b > a;
        // if a >= b then a + b + abs(a - b) = a + b + a - b = 2a; 2a / 2 = a;
        // if b > a then a + b + abs(a - b) = a + b + b - a = 2b; 2b / 2 = b;
        int max = (a + b + Math.abs(a - b)) / 2;

        System.out.println(max);
    }
}
