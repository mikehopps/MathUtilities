/**
 * Created by michael_hopps on 9/20/17.
 */
public class LineMain {

    public static void main(String[] args) {
        LinearFunction line1 = new LinearFunction(2, 3);
        LinearFunction line2 = new LinearFunction(1, 1, 2, 5);

        line1.printIntersection(line2);

    }
}
