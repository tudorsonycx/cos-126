package textbook.ch1.sec2.webexercises.wex11;

public class StandardDeviation {
    public static void main(String[] args) {
        double u1 = Math.random();
        double u2 = Math.random();
        double u3 = Math.random();
        double u4 = Math.random();
        double u5 = Math.random();

        double avg = (u1 + u2 + u3 + u4 + u5) / 5;

        double devU1 = Math.pow(u1 - avg, 2);
        double devU2 = Math.pow(u2 - avg, 2);
        double devU3 = Math.pow(u3 - avg, 2);
        double devU4 = Math.pow(u4 - avg, 2);
        double devU5 = Math.pow(u5 - avg, 2);

        double sumDev = devU1 + devU2 + devU3 + devU4 + devU5;

        double variance = sumDev / 4;

        double stdDev = Math.sqrt(variance);

        System.out.println(stdDev);
    }
}
