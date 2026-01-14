package textbook.ch1.sec2.webexercises.wex12;

public class AllThreeEqual {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean areAllThreeEqual = a == b && b == c;

        System.out.println(areAllThreeEqual);
    }
}
