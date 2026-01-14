package textbook.ch1.sec2.webexercises.wex3;

public class YIQtoRGB {
    public static void main(String[] args) {
        double y = Double.parseDouble(args[0]);
        double i = Double.parseDouble(args[1]);
        double q = Double.parseDouble(args[2]);

        double rN = y + 0.956 * i + 0.619 * q;
        double gN = y - 0.272 * i - 0.647 * q;
        double bN = y - 1.106 * i + 1.703 * q;

        int r = (int) (rN * 255);
        int g = (int) (gN * 255);
        int b = (int) (bN * 255);

        System.out.println("YIQ = " + "(" + y + ", " + i + ", " + q + ")");
        System.out.println("RGBN = " + "(" + rN + ", " + gN + ", " + bN + ")");
        System.out.println("RGB = " + "(" + r + ", " + g + ", " + b + ")");
    }
}
