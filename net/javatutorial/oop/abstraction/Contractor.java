 /**
  * modified     20201016
  * date         20200915
  * @filename	 Contractor.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.abstraction;

/**
 *
 * @author https://javatutorial.net/java-abstraction-example
 */
public class Contractor extends Employee {
    
    private int workingHours;
    
    public Contractor(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
    
}
