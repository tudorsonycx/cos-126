package textbook.ch1.sec3.exercises.ex38;

public class Exponential {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double curr = 1;
        double sum = 0;

        int iters = 0;

        for (int i = 1; sum != sum + curr; i++) {
            iters++;

            sum += curr;

            curr *= x / i;
        }

        System.out.println(sum + " in " + iters + " iterations");
    }
}
