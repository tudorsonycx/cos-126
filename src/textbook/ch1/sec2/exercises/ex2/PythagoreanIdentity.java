package textbook.ch1.sec2.exercises.ex2;

public class PythagoreanIdentity {
    public static void main(String[] args) {
        double theta = Double.parseDouble(args[0]);

        double sinSquared = Math.pow(Math.sin(theta), 2);
        double cosSquared = Math.pow(Math.cos(theta), 2);

        double pythagoreanIdentity = sinSquared + cosSquared;
        long pythagoreanIdentityRounded = Math.round(pythagoreanIdentity);
        boolean isPythagoreanIdentityApproximatelyOne = pythagoreanIdentityRounded == 1;

        System.out.println(pythagoreanIdentity);
        System.out.println(pythagoreanIdentityRounded);
        System.out.println(isPythagoreanIdentityApproximatelyOne);
    }
}
