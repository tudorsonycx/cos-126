package textbook.ch1.sec2.exercises.ex26;

public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println("Cartesian coordinates: (x, y) = " + "(" + x + ", " + y + ")");
        System.out.println("Polar coordinates: (r, theta) = " + "(" + r + ", " + theta + ")");
    }
}
