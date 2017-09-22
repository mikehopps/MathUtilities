/**
 * Created by michael_hopps on 9/20/17.
 */
public class LineMain {

    public static void main(String[] args) {
        LinearFunction line1 = new LinearFunction(.4, 3);
        LinearFunction line2 = new LinearFunction((0.36+0.04), 3);

        line1.printIntersection(line2);
        System.out.println(0.36 + 0.04);

    }
}
