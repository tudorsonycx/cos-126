package textbook.ch1.sec2.webexercises.wex28;

public class Barycenter {
    public static void main(String[] args) {
        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        double min = Math.min(m1, m2);


        double r1 = a * min / (m1 + m2);

        System.out.println(r1);
    }
}
