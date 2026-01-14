package textbook.ch1.sec2.webexercises.wex19;

public class Divisibility {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        // have to check each of them.
        // let a, b and n be integers, n > 0; if a | n and b | n then a + b | n;
        // the converse is not true: a = 1, b = 6; a + b | 7 but a and b are NOT;
        boolean areBothDivBy7 = x % 7 == 0 && y % 7 == 0;

        System.out.println(areBothDivBy7);
    }
}
