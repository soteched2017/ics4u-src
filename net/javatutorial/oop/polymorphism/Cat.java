 /**
  * modified     20201016
  * date         20200915
  * @filename	 Cat.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.polymorphism;


/**
 *
 * @author https://javatutorial.net/java-polymorphism-example
 */
public class Cat extends Animal {
	
    @Override
    public void makeSound() {
        System.out.println("the cat meows");
    }
}
