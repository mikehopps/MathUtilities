/**
 * Created by michael_hopps on 9/14/17.
 */
public class Quadratic {
    private double a, b, c;

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


    //prints the roots like this: x = -3, 1
    //if no solutions, prints: No solution
    public void printRoots(){

        if( b*b - 4*a*c < 0 ){ //no solution...
            System.out.println("No solution");
        }
        else{ //executes if the if was false...
            System.out.println("x = " + getRootA() + ", " + getRootB());
        }
    }

}