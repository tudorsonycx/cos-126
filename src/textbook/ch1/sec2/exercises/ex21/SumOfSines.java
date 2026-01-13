package textbook.ch1.sec2.exercises.ex21;

public class SumOfSines {
    public static void main(String[] args) {
        // not specified whether t is an angle measured in degrees or radians
        double t = Double.parseDouble(args[0]);

        double sinesSum = Math.sin(2 * t) + Math.sin(3 * t);

        System.out.println("t = " + t);
        System.out.println("sum no conversion of t to radians: " + sinesSum);

        t = Math.toRadians(t);

        System.out.println("t after radian conversion = " + t);

        sinesSum = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println("sum conversion of t to radians = " + sinesSum);
    }
}
