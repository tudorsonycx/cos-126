package textbook.ch1.sec3.exercises.ex13;

public class IntReverse {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;

        // the code simply reverses n. as long as n is not 0, we take its last digit and add it to m * 10 and assign the
        // result of the expression to m. at the end of the loop, if n is initially 123456789. n will be 10 and m will be
        // 987654321. it works because n % 10 returns the last digit of an int.
        while (n != 0) {
            m = m * 10 + n % 10;

            n /= 10;
        }

        System.out.println(n + " " + m);
    }
}
