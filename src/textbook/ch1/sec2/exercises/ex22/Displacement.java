package textbook.ch1.sec2.exercises.ex22;

public class Displacement {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double G = 9.80665;

        double displacement = x0 + v0 * t - G * t * t / 2;

        System.out.println(displacement);
    }
}
