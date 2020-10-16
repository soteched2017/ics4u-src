 /**
  * modified     20201016
  * date         20200915
  * @filename	 PolymorphismExample.java
  * @author      javatutorial.net
  * @version     1.0
  * @see         units 1 through 4 content
  */
package net.javatutorial.oop.polymorphism;


/**
 *
 * @author ke
 */
public class PolymorphismExample {
	
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.makeSound();
            
        Dog dog = new Dog();
        dog.makeSound();
            
        animal = new Cat();
        animal.makeSound();
    }
    
}