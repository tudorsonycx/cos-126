package textbook.ch1.sec3.exercises.ex9;

public class KPerLineSimple {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        int i = Math.abs(n - m) + 1;

        int incOrDec = 1;

        if (n < m) {
            incOrDec = -1;
        }

        for (int j = 0; j < i; j++) {
            System.out.print(m + " ");

            m += incOrDec;

            if ((j + 1) % k == 0) {
                System.out.println();
            }
        }

        if (i % k != 0) {
            System.out.println();
        }

    }
}
