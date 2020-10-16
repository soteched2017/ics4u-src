 /**
  * modified     20201016
  * date         20200915
  * @filename	 Point.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.inheritance;


/**
 *
 * @author https://javatutorial.net/java-inheritance-example
 */
public class Point {
    
    // fields marking X and Y position of the point
    public int x; // encapsulation = private
    public int y;

    // one constructor
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    // getter and setter methods
    
    public int getX() {
        System.out.println("Point.getX()");
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public static void main (String[] args) {
        System.out.println("Point.main");
    }

}
