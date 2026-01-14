package textbook.ch1.sec2.webexercises.wex21;

public class HorizontalCoordinates {
    public static void main(String[] args) {
        double phi = Double.parseDouble(args[0]);
        double delta = Double.parseDouble(args[1]);
        double h = Double.parseDouble(args[2]);

        double alt = Math.asin(Math.sin(phi) * Math.sin(delta) + Math.cos(phi) * Math.cos(delta) * Math.cos(h));
        double azimuth = Math.acos((Math.cos(phi) * Math.sin(delta) - Math.sin(phi) * Math.cos(delta) * Math.cos(h)) / Math.cos(alt));

        System.out.println(alt + " " + azimuth);
    }
}
