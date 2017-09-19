/**
 * Created by michael_hopps on 9/14/17.
 */
public class MathMain {
    public static void main(String[] args) {
        //Make a Quadratic object modelling x^2 + 2x - 3
        Quadratic quad = new Quadratic(.5, -7, -39);
        quad.printRoots();

//        System.out.println( quad.getY(1) );  //             0
//        System.out.println( quad.getY(3) );  //9+6-3 =      12

        quad.printVertex();




    }

}
