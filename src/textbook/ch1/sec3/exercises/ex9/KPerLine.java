package textbook.ch1.sec3.exercises.ex9;

public class KPerLine {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int q = (Math.abs(m - n) + 1) / k;

        int r = Math.abs(m - n) + 1 - q * k; // %

        int incOrDec;

        if (n > m) {
            incOrDec = -1;
        } else {
            incOrDec = 1;
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(n + " ");

                n += incOrDec;
            }

            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            System.out.print(n + " ");

            n += incOrDec;
        }

        if (r != 0) {
            System.out.println();
        }
    }
}
