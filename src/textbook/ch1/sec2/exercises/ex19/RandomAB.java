package textbook.ch1.sec2.exercises.ex19;

public class RandomAB {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double r = Math.random();

        // formula works for positive integers due to (int) truncation rounding towards 0;
        // [0, 1) * (b - a + 1) = [0, b - a + 1); [0, b - a + 1) + a = [a, b + 1); (int)[a, b + 1) = [a, b]
        // ex: a = 1, b = 10; [0, 1) * (10 - 1 + 1) = [0, 10); [0, 10) + 1 = [1, 11); (int)[1, 11) = [1, 10];
        // S = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
        // it won't work for negative numbers;
        // ex: a = -5, b = -3; [0, 1) * (-3 + 5 + 1) = [0, 3); [0, 3) - 5 = [-5, -2); (int)[-5, -2) = [-5, -2];
        // S = [-5, -4, -3, -2]; expected S = [-5, -4, -3];
        int randInt = (int)(r * (b - a + 1)) + a;

        System.out.println("rounding towards 0 result: " + randInt);
        // corrected formula that handles both positive and negative numbers always rounds towards -Infinity;
        randInt = (int)(Math.floor(r * (b - a + 1)) + a);

        System.out.println("rounding towards -Infinity result: " + randInt);
    }
}
