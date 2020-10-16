 /**
  * modified     20201016
  * date         20200915
  * @filename	 Dog.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.polymorphism;


/**
 *
 * @author https://javatutorial.net/java-polymorphism-example
 */
public class Dog extends Animal{
	
    @Override
    public void makeSound() {
        System.out.println("the dog barks");
    }
}
