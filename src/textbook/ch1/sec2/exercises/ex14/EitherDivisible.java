package textbook.ch1.sec2.exercises.ex14;

public class EitherDivisible {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean doesADivideB = a % b == 0;
        boolean doesBDivideA = b % a == 0;
        boolean doesEitherDivideTheOther = doesADivideB || doesBDivideA;

        System.out.println(doesEitherDivideTheOther);
    }
}
