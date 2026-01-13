package textbook.ch1.sec2.exercises.ex32;

public class RGBtoCMYK {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));
        double c = (w - r / 255.0) / w;
        double m = (w - g / 255.0) / w;
        double y = (w - b / 255.0) / w;
        double k = 1 - w;

        System.out.println("RGB = " + "(" + r + ", " + g + ", " + b + ")");
        System.out.println("CMYK = " + "(" + c + ", " + m + ", " + y + ", " + k + ")");
    }
}
