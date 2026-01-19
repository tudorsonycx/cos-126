package textbook.ch1.sec3.exercises.ex2;

public class Quadratic {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("discriminant is negative");
        } else if (a != 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("roots = {" + r1 + ", " + r2 + "}");
        } else {
            System.out.println("a can't be 0");
        }
    }
}
