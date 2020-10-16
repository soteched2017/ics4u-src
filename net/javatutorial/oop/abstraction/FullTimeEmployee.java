 /**
  * modified     20201016
  * date         20200915
  * @filename	 FullTimeEmployee.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.abstraction;

/**
 *
 * @author ke
 */
public class FullTimeEmployee extends Employee {
    
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
    
}
