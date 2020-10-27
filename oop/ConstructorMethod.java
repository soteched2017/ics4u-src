/**
 * constructor
 * 
 * definitions: declaration, initialization, instantiation
 * 
 * examples for computer science, 12 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201027
 * date         20201027
 * @filename	ConstructorMethod.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */

 class ConstructorMethod {

    boolean defaultBool; // default = false
    
    
    ConstructorMethod() { // no argument constructor
        defaultBool = true;
        System.out.println("ConstructorMethod.ConstructorMethod()");
    } 
    
    ConstructorMethod(boolean d) { // overloaded constructor, different method signature
        defaultBool = d;
        System.out.println("ConstructorMethod.ConstructorMethod( " + defaultBool + " )");
    }

    public static void main (String[] args) {
        
        System.out.println("\n\n // example 1 - default constructor");
        new ConstructorMethod(); // note: instantiates but not assigned to a variable

        System.out.println("\n\n // example 2 - default constructor, setting a property (or can calling some method)");
        new ConstructorMethod().defaultBool = false; // note: instantiates but not assigned to a variable

        System.out.println("\n\n // example 3 - default constructor");
        ConstructorMethod cm3 = new ConstructorMethod(); // note: a variable was declared and initialized with object instance

        System.out.println("\n\n // example 4 - overloaded constructor");
        ConstructorMethod cm4 = new ConstructorMethod(false);

        System.out.println("\n\n public static void ConstructorMethod.main()");

    }
}


/*
// this also works, creating objects from other classes:
class Main {

    public static void main (String[] args) {
        
        System.out.println("\n\n // example 1a - ConstructorMethod created/destroyed immediately");
        new ConstructorMethod();

        System.out.println("\n\n // example 1b - ConstructorMethod created/destroyed immediately");
        new ConstructorMethod().defaultBool = false;

        System.out.println("\n\n // example 2 - ConstructorMethod object assigned to cm");
        ConstructorMethod cm = new ConstructorMethod();

        System.out.println("\n\n public static void ConstructorMethod.main()");

    }
}
*/
