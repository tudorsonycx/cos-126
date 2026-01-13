package textbook.ch1.sec2.exercises.ex13;

public class SquareOfSquareRootOfTwo {
    public static void main(String[] args) {
        // always false due to double only having finite precision and
        // irrational numbers having infinite digits after the decimal point
        double squareOfSquareRootOfTwo = Math.sqrt(2) * Math.sqrt(2);
        boolean isEqual = squareOfSquareRootOfTwo == 2.0;

        System.out.println(isEqual);
        System.out.println("actual result: " + squareOfSquareRootOfTwo);
    }
}
