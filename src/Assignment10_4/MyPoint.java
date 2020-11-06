/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 05/11/2020
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
    // The data field x and y that represent the coordinates with getter methods.
    private int x;
    private int y;
    private int thisPointX;
    private int thisPointY;
    private int specifiedPointX;
    private int specifiedPointY;
    private int anotherSpecifiedPointX;
    private int anotherSpecifiedPointY;

    //Getter x
    public int getX() {
        return x;
    }
    //Getter y
    public int getY() {
        return y;
    }

    //Setter setThisPointX
    public void setThisPointX(int thisPointX) {
        this.thisPointX = thisPointX;
    }
    //Setter setThisPointY
    public void setThisPointY(int thisPointY) {
        this.thisPointY = thisPointY;
    }
    //Setter setSpecifiedPointX
    public void setSpecifiedPointX(int specifiedPointX) {
        this.specifiedPointX = specifiedPointX;
    }
    //Setter setSpecifiedPointY
    public void setSpecifiedPointY(int specifiedPointY) {
        this.specifiedPointY = specifiedPointY;
    }
    //Setter setAnotherSpecifiedPointX
    public void setAnotherSpecifiedPointX(int anotherSpecifiedPointX) {
        this.anotherSpecifiedPointX = anotherSpecifiedPointX;
    }

    //Setter setAnotherSpecifiedPointY
    public void setAnotherSpecifiedPointY(int anotherSpecifiedPointY) {
        this.anotherSpecifiedPointY = anotherSpecifiedPointY;
    }

    // A no-arg constructor that creates a point (0,0).
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    // A constructor that constructs a point with specified coordinates.
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        // A no-arg constructor that creates a point (0,0).
        MyPoint myPoint1 = new MyPoint();
        System.out.println("No-arg constructor with the coordinates: (" + myPoint1.getX() + "," + myPoint1.getY() + ")");

        System.out.println("");

        // A constructor that constructs a point with specified coordinates.
        MyPoint myPoint2 = new MyPoint(3,4);
        System.out.println("Constructor with specified coordinates: (" + myPoint2.getX() + "," + myPoint2.getY() + ")");

        System.out.println("");

        // A method named distance that returns the distance from this point to a specified point of the MyPoint type.
        MyPoint thisToSpecifiedPoint = new MyPoint();
        thisToSpecifiedPoint.setThisPointX(3);
        thisToSpecifiedPoint.setThisPointY(4);
        thisToSpecifiedPoint.setSpecifiedPointX(4);
        thisToSpecifiedPoint.setSpecifiedPointY(3);

        double roundDistance = thisToSpecifiedPoint.distance(thisToSpecifiedPoint.thisPointX,
                thisToSpecifiedPoint.thisPointY, thisToSpecifiedPoint.specifiedPointX,
                thisToSpecifiedPoint.specifiedPointY);

        //Math.round 5 decimals
        System.out.println("The distance between thisPoint and specifiedPoint: " + Math.round((roundDistance)*100000.0)/100000.0);

        System.out.println("");

        // A method named distance that returns the distance from this point to another specified x- and y-coordinates.
        MyPoint thisToAnotherSpecifiedPoint = new MyPoint();
        thisToAnotherSpecifiedPoint.setAnotherSpecifiedPointX(4);
        thisToAnotherSpecifiedPoint.setAnotherSpecifiedPointY(3);

        double roundDistance2 = thisToSpecifiedPoint.distance(thisToSpecifiedPoint.thisPointX,
                thisToSpecifiedPoint.thisPointY, thisToAnotherSpecifiedPoint.anotherSpecifiedPointX,
                thisToAnotherSpecifiedPoint.anotherSpecifiedPointY);

        //Math.round 5 decimals
        System.out.println("The distance2 between thisPoint and anotherSpecifiedPoint: " + Math.round((roundDistance)*100000.0)/100000.0);


    }

    // A method named distance that returns the distance from this point to a specified point of the MyPoint type.
    public static double distance(int thisPointX, int thisPointY, int specifiedPointX, int specifiedPointY){

        // Calculating distance between two points
        double distance =
            Math.sqrt(Math.pow(specifiedPointX - thisPointX, 2) +
            Math.pow(specifiedPointY - thisPointY, 2) * 1.0);

        return distance;
    }

    // A method named distance that returns the distance from this point to another specified x- and y-coordinates.
    public static double distance2(int thisPointX, int thisPointY, int anotherSpecifiedPointX, int anotherSpecifiedPointY){

        // Calculating distance between two points
        double distance =
                Math.sqrt(Math.pow(anotherSpecifiedPointX - thisPointX, 2) +
                        Math.pow(anotherSpecifiedPointY - thisPointY, 2) * 1.0);

        return distance;
    }
}
