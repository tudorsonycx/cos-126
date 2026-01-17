package textbook.ch1.sec3.programs.p7;

/******************************************************************************
 *  Compilation:  javac Binary.java
 *  Execution:    java Binary n
 *
 *  Prints out n in binary.
 *
 *  % java Binary 5
 *  101
 *
 *  % java Binary 106
 *  1101010
 *
 *  % java Binary 0
 *  0
 *
 *  % java Binary 16
 *  10000
 *
 *  Limitations
 *  -----------
 *  Does not handle negative integers.
 *
 *  Remarks
 *  -------
 *  could use Integer.toBinaryString(N) instead.
 *
 ******************************************************************************/

public class Binary {
    public static void main(String[] args) {
        // negative integers will trigger an infinite loop due to pow = 1 > n always
        int n = Integer.parseInt(args[0]);
        int m = n;

        int pow = 1;

        // don't use pow * 2 <= n due to overflow risk; example: n = 1073741824 (2 to the 30th);
        // pow starts as 1, and at one point will reach pow = 1073741824 = n;
        // the following condition will be tested: pow * 2 <= n which is obviously false BUT now,
        // pow * 2 = 2147483648 > Integer.MAX_VALUE, so it will overflow and be instead interpreted as -2147483648
        // which is Integer.MIN_VALUE, so on the next iteration pow * 2 = -4294967296 which overflows again and will be
        // interpreted as 0, so the next iterations will all have pow = 0 which is obviously less than n, thus continuing
        // the loop infinitely
        while (pow <= n / 2) {
            pow *= 2;
        }


        while (n != 0) {
            if (pow <= n) {
                System.out.print("1");

                n -= pow;
            } else {
                System.out.print("0");
            }

            pow /= 2;
        }

        System.out.println();
    }
}
