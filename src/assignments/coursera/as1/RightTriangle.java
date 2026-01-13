package assignments.coursera.as1;

public class RightTriangle {
    public static void main(String[] args) {
        long a = Integer.parseInt(args[0]);
        long b = Integer.parseInt(args[1]);
        long c = Integer.parseInt(args[2]);

        long aSq = a * a;
        long bSq = b * b;
        long cSq = c * c;

        boolean isRightTriangle =
                a > 0 && b > 0 && c > 0
                        && (aSq + bSq == cSq
                        || aSq + cSq == bSq
                        || bSq + cSq == aSq);

        System.out.println(isRightTriangle);
    }
}
