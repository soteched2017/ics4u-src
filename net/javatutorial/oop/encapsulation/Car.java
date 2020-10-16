 /**
  * modified     20201016
  * date         20200915
  * @filename	 Car.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.encapsulation;

/**
 *
 * @author https://javatutorial.net/java-encapsulation-example
 */
public class Car {
    
    // private variables
    private String name;
    private double topSpeed;
    private double currentSpeed;

    public Car() {}
    
    public Car(String name) {
        this.name = name;
    }

    // pubblic get/setters
    
    public String getName() {
            return name;
    }
    
    public void setName(String name) {
            this.name = name;
    }
    
    public void setTopSpeed(double speedMPH) {
            topSpeed = speedMPH;
    }

    public double getTopSpeedMPH() {
            return topSpeed;
    }

    public double getTopSpeedKMH() {
            return topSpeed * 1.609344;
    }
    
    public void accelerate() {

            // add 10 miles per hour to current speed
            currentSpeed = currentSpeed + 10;
    }

    public void park() {

            // set current speed to zero
            currentSpeed = 0;
    }

    public void printCurrentSpeed() {

            // display the current speed of this car
            System.out.println("The current speed of " + name + " is " + currentSpeed + " mpH");
    }
        
}
