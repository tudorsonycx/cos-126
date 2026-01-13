package textbook.ch1.sec2.exercises.ex30;

public class Stats5 {
    public static void main(String[] args) {
        double u1 = Math.random();
        double u2 = Math.random();
        double u3 = Math.random();
        double u4 = Math.random();
        double u5 = Math.random();

        double avg = (u1 + u2 + u3 + u4 + u5) / 5;

        double min = Math.min(u1, Math.min(u2, Math.min(u3, Math.min(u4, u5))));
        double max = Math.max(u1, Math.max(u2, Math.max(u3, Math.max(u4, u5))));

        System.out.println("numbers: " + u1 + ", " + u2 + "," + u3 + ", " + u4 + "," + u5);
        System.out.println("average = " + avg);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
