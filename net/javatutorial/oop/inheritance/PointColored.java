 /**
  * modified     20201016
  * date         20200915
  * @filename	 PointColored.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.inheritance;


/**
 *
 * @author https://javatutorial.net/java-inheritance-example
 */
public class PointColored extends Point {
		
    public String colorName; // new field added to store the color name
    public int x; // hides superclass.x

    public PointColored(int x, int y, String colorName) {
        super(-1, y);
        this.x = x;
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    // overrides superclass.getX
    public int getX() { 
        System.out.println("PointColored.getX()");
        // return this.x; // hides superclass.x
        return super.x;
    }

    public static void main (String[] args) {
        System.out.println("PointColored.main");
    }
        
}
