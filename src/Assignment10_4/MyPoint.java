/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 07/11/2020
 *
 */

package Assignment10_4;

/*
 * Design a class named MyPoint to represent a point with x-and y-coordinates.
 * The class contains:
 * - The data field x and y that represent the coordinates with getter methods.
 * - A no-arg constructor that creates a point (0,0).
 * - A constructor that constructs a point with specified coordinates.
 * - A method named distance that returns the distance from this point to a specified point of the MyPoint type.
 * - A method named distance that returns the distance from this point to another specified x- and y-coordinates.
 * - A static method named distance that returns the distance from two MyPoint objects.
 * Draw UML diagram for the class then implement the class.
 * Write a test program that creates the two points(0,0) and (10,30.5) and displays the distance between them.
 */

public class MyPoint {

    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // no-arg constructor that set default x and y values to 0
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }

     // A constructor that constructs a point with specified coordinates.
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        //Show result of distance from this point to a specified point of the MyPoint type.
        MyPoint point1 = new MyPoint(0,0);
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.println(point1.distance(point2));

        System.out.println("");

        //show result for the static method
        MyPoint point3 = new MyPoint(3,4);

        System.out.println("The distance method result for distance between point3 and the new MyPoint object created: "
                + point3.distance(4, 3));
    }

    // A method named distance that returns the distance from this point to a specified point (default x and y values)
    // of the MyPoint type.
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + Math.pow(myPoint.getY() - y, 2) * 1.0);
    }

    // A static method named distance that returns the distance from two MyPoint objects with specified coordinates.
    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

    // A static method named distance that returns the distance from two MyPoint objects.
    public static double distanceTwoObjects(double x1, double x2, double y1, double y2){
        double distance=
                Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
        return distance;
    }
}
