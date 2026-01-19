package textbook.ch1.sec3.exercises.ex5;

public class RollLoadedDie {
    public static void main(String[] args) {
        int roll = (int) (Math.random() * 8) + 1;

        System.out.println(Math.min(roll, 6));
    }
}
