package textbook.ch1.sec3.exercises.ex14;

public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int f = 0, g = 1;

        // prints the Fibonacci sequence: f0 = 0, f1 = 1, fn = fn-1 + fn-2, n > 1;
        // in our case f represents fn and g fn-1. the code works because by the above relation we have fn-1 = fn - fn-2;
        // at the beginning of a loop iteration we have f = f + g which represents fn = fn-1 + fn-2 and g = f - g which
        // represents fn-1 = fn - fn-2
        for (int i = 0; i < n; i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
