package textbook.ch1.sec2.exercises.ex24;

public class ContinuouslyCompoundedInterest {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]) / 100;
        int t = Integer.parseInt(args[2]);

        double interest = p * Math.pow(Math.E, r * t);

        System.out.println(interest);
    }
}
