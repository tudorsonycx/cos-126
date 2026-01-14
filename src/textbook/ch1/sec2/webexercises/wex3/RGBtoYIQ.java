package textbook.ch1.sec2.webexercises.wex3;

public class RGBtoYIQ {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double rN = r / 255.0;
        double gN = g / 255.0;
        double bN = b / 255.0;

        double y = 0.299 * rN + 0.587 * gN + 0.114 * bN;
        double i = 0.596 * rN - 0.275 * gN - 0.321 * bN;
        double q = 0.212 * rN - 0.523 * gN + 0.311 * bN;

        System.out.println("RGB = " + "(" + r + ", " + g + ", " + b + ")");
        System.out.println("RGBN = " + "(" + rN + ", " + gN + ", " + bN + ")");
        System.out.println("YIQ = " + "(" + y + ", " + i + ", " + q + ")");
    }
}
