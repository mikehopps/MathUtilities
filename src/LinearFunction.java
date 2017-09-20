/**
 * Created by michael_hopps on 9/19/17.
 */
public class LinearFunction {

    private double slope, yInt;

    public LinearFunction(double slope, double yInt) {
        this.slope = slope;
        this.yInt = yInt;
    }

    public LinearFunction(double x1, double y1, double x2, double y2){
        slope = (y1-y2)/(x1-x2);
        yInt = y1 - slope*x1;
    }

    public double getSlope() {
        return slope;
    }

    public double getyInt() {
        return yInt;
    }

    public double getY(double x){
        return slope*x + yInt;
    }

    public double getX(double y){
        return (y - yInt)/slope;
    }

    public void printThreePoints(double startX, double dx){
        double a = getY(startX); //first point
        double b = getY(startX + dx);
        double c = getY(startX + dx*2);
        System.out.println( "(" + startX + ", " + a + ")");
        System.out.println( "(" + (startX+dx) + ", " + b + ")");
        System.out.println( "(" + (startX+dx*2) + ", " + c + ")");
    }



    public void printIntersection(LinearFunction other){
        double top = other.getyInt() - yInt;
        double bottom = slope - other.getSlope();
        double x = top/bottom;
        double y = getY(x);
        System.out.println("(" + x + ", " + y + ")");
    }



}
