 /**
  * modified     20201016
  * date         20200915
  * @filename	 EncapsulationExample.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.encapsulation;

/**
 *
 * @author https://javatutorial.net/java-encapsulation-example
 */
public class EncapsulationExample {
    
    public static void main(String[] args) {
        
        // create new Audi car
        Car audi = new Car("Audi"); // notice: contructor has 1 parameter
        // create new Nissan car
        Car nissan = new Car("Nissan");

        // print current speed of Audi - it is 0 
        audi.printCurrentSpeed();

        // call the accelerate method twice on Audi
        audi.accelerate();
        audi.accelerate();

        // call the accelerate method once on Nissan
        nissan.accelerate();

        // print current speed of Audi - it is now 20 mpH
        audi.printCurrentSpeed();
        // print current speed of Nissan - it is 10 mpH
        nissan.printCurrentSpeed();

        // now park the Audi car
        audi.park();

        // print current speed of Audi - it is now 0, because the car is parked
        audi.printCurrentSpeed();
        
        Car car = new Car();
        car.setName("Porsche Cayenne 4.8-litre V8");
        car.setTopSpeed(173.0d);
        System.out.println(car.getName() + " top speed in MPH is " + car.getTopSpeedMPH());
        System.out.println(car.getName() + " top speed in KMH is " + car.getTopSpeedKMH());
                
    }
    
}
