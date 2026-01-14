package textbook.ch1.sec2.webexercises.wex30;

public class CarLoan {
    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double n = 12 * y;
        double _r = r / 100 / 12;

        double payment = p * _r / (1 - Math.pow(1 + _r, -n));
        double interest = payment * n - p;

        System.out.println(payment);
        System.out.println(interest);
    }
}
