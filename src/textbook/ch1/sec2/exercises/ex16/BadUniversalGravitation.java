package textbook.ch1.sec2.exercises.ex16;

public class BadUniversalGravitation {
    public static void main(String[] args) {
        double G = 6.674e-11;

        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);

        double r = Double.parseDouble(args[2]);

        // division and multiplication operators have the same precedence, so they're left associative,
        // meaning that res1 = G * m1 is calculated first, then res2 = res1 * m2, then res3 = res2 / r,
        // then res4 = res3 * r, effectively dividing res2 by r and immediately multiplying it back by r
        // instead of dividing res2 by (r * r)
        double wrongF = G * m1 * m2 / r * r;
        double f = G * m1 * m2 / (r * r);

        System.out.println("wrong F: " + wrongF);
        System.out.println("correct F: " + f);
    }
}
