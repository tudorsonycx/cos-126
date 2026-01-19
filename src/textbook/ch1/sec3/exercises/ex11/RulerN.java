package textbook.ch1.sec3.exercises.ex11;

public class RulerN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        String ruler = "1";
        // explanation: what happens when n is too large?
        // well, each iteration doubles the previous ruler's length and adds at least 3 characters. (the 2 whitespaces
        // and i which after 9 will count as 2 digits).for example, if n = 3 then ruler = "1 2 1 3 1 2 1" and its length is 13. If n = 6 then
        // ruler = "1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 6 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1 5 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1"
        // and its length is 125. in fact, if n = k, then the length of the ruler will be around 2^(k+1)
        // for n = 100 that means that the length of the ruler will be 2^101. the java program will simply throw
        // an OutOfMemory exception because the maximum number of characters a string can hold in java is 2^31 - 1.
        for (int i = 2; i <= n; i++) {
            ruler = ruler + " " + i + " " + ruler;
        }

        System.out.println(ruler.length());
    }
}
