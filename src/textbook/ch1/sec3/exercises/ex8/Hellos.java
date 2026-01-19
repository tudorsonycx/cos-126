package textbook.ch1.sec3.exercises.ex8;

public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            int last2Digits = i % 100;
            int lastDigit = i % 10;

            if (last2Digits >= 10 && last2Digits <= 20) {
                System.out.println(i + "th hello");
            } else if (lastDigit == 1) {
                System.out.println(i + "st hello");
            } else if (lastDigit == 2) {
                System.out.println(i + "nd hello");
            } else if (lastDigit == 3) {
                System.out.println(i + "rd hello");
            } else {
                System.out.println(i + "th hello");
            }
        }
    }
}
