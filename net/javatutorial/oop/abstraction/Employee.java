 /**
  * modified     20201016
  * date         20200915
  * @filename	 Employee.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.abstraction;

/**
 *
 * @author ke
 */
public abstract class Employee { // abstract = cannot be instantiated
    
    private String name;
    private int paymentPerHour;
	
    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract int calculateSalary();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}
