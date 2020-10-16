 /**
  * modified     20201016
  * date         20200915
  * @filename	 InheritanceExample.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.inheritance;


/**
 *
 * @author https://javatutorial.net/java-inheritance-example
 */
public class InheritanceExample {
    
    public static void main(String[] args) {
        
        Point point = new PointColored(2, 4, "red");

        if (point instanceof PointColored) {
            PointColored coloredPoint = (PointColored)point;
            System.out.println( "coloredPoint.getColorName() " + coloredPoint.getColorName() );
            System.out.println( "coloredPoint.getX() " + coloredPoint.getX() );
            System.out.println( "coloredPoint.getY() " + coloredPoint.getY() );
            System.out.println( "coloredPoint.x " + coloredPoint.x );
            System.out.println( "coloredPoint.y " + coloredPoint.y );
        }
        
        point.main(null);
        
        PointColored coloredPoint = new PointColored(0, 0, "orange");
        coloredPoint.main(null);
        
        Point.main(null);
        PointColored.main(null);
    }    
}
