package textbook.ch1.sec2.exercises.ex18;

public class EuclideanDistance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double euclideanDistance = Math.sqrt(x * x + y * y);

        System.out.println(euclideanDistance);
    }
}
