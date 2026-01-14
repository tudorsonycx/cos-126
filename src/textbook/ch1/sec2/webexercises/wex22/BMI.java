package textbook.ch1.sec2.webexercises.wex22;

public class BMI {
    public static void main(String[] args) {
        double weightKg = Double.parseDouble(args[0]);
        double heightM = Double.parseDouble(args[1]);

        double bmi = weightKg / (heightM * heightM);

        System.out.println(bmi);
    }
}
