package textbook.ch1.sec2.webexercises.wex27;

public class CubicDiscriminant {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[2]);

        double delta = b * b * c * c - 4 * c * c * c - 4 * b * b * b * d - 27 * d * d + 18 * b * c * d;

        System.out.println(delta);
    }
}
