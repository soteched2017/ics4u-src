/**
 * access modifier example
 * 
 * modifier     class   package     subclass    world
 * --------     -----   -------     --------    -----
 * public       y       y           y           y
 * protected    y       y           y           n
 * no modifier  y       y           n           n
 * private      y       n           n           n
 * 
 * see https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 * 
 * examples for computer science, 12 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201027
 * date         20201027
 * @filename	AccessExample.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */

// notice: no package, no modifier (or default)

class AccessExample {

    public static void main (String[] args) {
        
        accessmod.PublicClass.main(null); // new accessmod.PublicClass().main(null);

        // error: ProtectedClass is not public in accessmod; cannot be accessed from outside package
        // accessmod.ProtectedClass.main(null); 
        
        

    }
}

// cd oop

// javac AccessExample.java accessmod/PublicClass.java accessmod/ProtectedClass.java

// java AccessExample