package textbook.ch1.sec2.exercises.ex34;

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // we could easily compute min(a, b, c) and max(a, b, c) and then subtract them from a + b + c to find the mid,
        // but I quite like this method; basically, computing the max between each number with the other 2 will yield
        // a mid and 2 maxes - we just have to compute the max between them to find which one it is, subtracting it 2 times
        // to yield the mid.
        int maxAB = Math.max(a, b);
        int maxBC = Math.max(b, c);
        int maxAC = Math.max(a, c);

        int max = Math.max(maxAB, Math.max(maxBC, maxAC));

        int mid = maxAB + maxBC + maxAC - 2 * max;

        int min = (a + b + c) - mid - max;

        System.out.println(min + " " + mid + " " + max);
    }
}
