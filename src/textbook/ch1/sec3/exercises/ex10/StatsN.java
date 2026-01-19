package textbook.ch1.sec3.exercises.ex10;

public class StatsN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0;
        double min = 1;
        double max = -0.1;

        for (int i = 0; i < n; i++) {
            double u = Math.random();

            sum += u;
            min = Math.min(min, u);
            max = Math.max(max, u);
        }

        System.out.println("avg = " + sum / n);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
