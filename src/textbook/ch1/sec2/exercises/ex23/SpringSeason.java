package textbook.ch1.sec2.exercises.ex23;

public class SpringSeason {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        // relies on the user's cooperation to only pass days and months that make sense;
        boolean isSpring = (m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <= 20);

        System.out.println("result when tolerating illegal dates = " + isSpring);

        // this one is complete and doesn't trust the user (never trust the user)
        isSpring = (m == 3 && d >= 20 && d <= 31)
                || (m == 4 && d >= 1 && d <= 30)
                || (m == 5 && d >= 1 && d <= 31)
                || (m == 6 && d >= 1 && d <= 20);


        System.out.println("result when taking into account illegal dates = " + isSpring);
    }
}
