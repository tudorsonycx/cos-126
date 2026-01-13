package textbook.ch1.sec2.exercises.ex35;

public class Dragon {
    public static void main(String[] args) {
        // F
        String dc0 = "F";
        String cd0 = "F";
        // FLF
        String dc1 = dc0 + "L" + cd0;
        // FRF
        String cd1 = dc0 + "R" + cd0;
        // FLFLFRF
        String dc2 = dc1 + "L" + cd1;
        // FLFRFRF
        String cd2 = dc1 + "R" + cd1;
        // FLFLFRFLFLFRFRF
        String dc3 = dc2 + "L" + cd2;
        // FLFLFRFRFLFRFRF
        String cd3 = dc2 + "R" + cd2;
        // FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRF
        String dc4 = dc3 + "L" + "FLFLFRFRFLFRFRF";
        // FLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
        String cd4 = dc3 + "R" + cd3;
        // FLFLFRFLFLFRFRFLFLFLFRFRFLFRFRFLFLFLFRFLFLFRFRFRFLFLFRFRFLFRFRF
        String dc5 = dc4 + "L" + cd4;

        System.out.println("dragon curve order 0 = " + dc0);
        System.out.println("dragon curve order 1 = " + dc1);
        System.out.println("dragon curve order 2 = " + dc2);
        System.out.println("dragon curve order 3 = " + dc3);
        System.out.println("dragon curve order 4 = " + dc4);
        System.out.println("dragon curve order 5 = " + dc5);
    }
}
