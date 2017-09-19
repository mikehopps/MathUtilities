/**
 * Created by michael_hopps on 9/14/17.
 */
public class Quadratic {
    private double a, b, c;  //ax^2 + bx + c

    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getRootA(){
//        double top = -b + Math.sqrt(b*b - 4*a*c);
//        double bottom = 2*a;
//        return top/bottom;
//
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }

    public double getRootB() {
        double ans = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        return ans;
    }

    //prints the roots like this: x = -3, 1`
    //if no solutions, prints: No solution
    public void printRoots(){
        if( b*b - 4*a*c < 0 ){ //no solution...
            System.out.println("No solution");
        }
        else{ //executes if the if was false...
            System.out.println("x = " + getRootA() + ", " + getRootB());
        }
    }

    //Write a getY(double x) method that returns the y value for the input x.
    //Test this in your main before moving on.
    public double getY(double x){
        double y = a*x*x + b*x + c;
        return y;
    }

    //Write a getVertexX() method.  Remember algebra has a formula.
    //Test this in your main before moving on.
    public double getVertexX(){
        double x = -b / (2*a);
        return x;
    }

    //Write a getVertexY() method.  You must use the getVertexX method
    //and the getY methods in your implementation.
    //Test this in your main before moving on.
    public double getVertexY(){
        return getY( getVertexX() );
    }

    //Write a printVertex() method.  Output format: The vertex is (3.0, 2.25)
    //Test this in your main before moving on.
    public void printVertex(){
        System.out.println("The vertex is (" + getVertexX() + ", " + getVertexY() + ")");
    }

}