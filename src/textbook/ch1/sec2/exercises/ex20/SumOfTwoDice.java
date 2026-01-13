package textbook.ch1.sec2.exercises.ex20;

public class SumOfTwoDice {
    public static void main(String[] args) {
        int diceRoll1 = (int) (Math.random() * 6) + 1;
        int diceRoll2 = (int) (Math.random() * 6) + 1;

        System.out.println(diceRoll1 + " + " + diceRoll2 + " = " + (diceRoll1 + diceRoll2));
    }
}
