package textbook.ch1.sec2.exercises.ex25;

public class WindChill {
    public static void main(String[] args) {
        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        double windChill = 35.74 + .6215 * temperature + (.4275 * temperature - 35.75) * Math.pow(velocity, .16);

        System.out.println(windChill);
    }
}
