/**
 * static property/method
 * 
 * examples for computer science, 12 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201027
 * date         20201027
 * @filename	Parent.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */

 class Parent {

    static boolean staticBool; // default = false
    
    
    Parent() {
        staticBool = true;
        System.out.println("Parent.Parent()");
    } 
    
    Parent(boolean b) {
        staticBool = b;
        System.out.println("Parent.Parent( " + staticBool + " )");
    }

    public static void main (String[] args) {
        
        System.out.println("\n\n // example 1 - default constructor");
        new Parent();

        System.out.println("\n\n // example 2 - default constructor, setting a static property (or calling some static method)");
        // new Parent().staticBool = false; 
        Parent.staticBool = true;
        System.out.println("\n Parent.staticBool=" + Parent.staticBool);

        System.out.println("\n\n // example 3 - default constructor");
        Parent p3 = new Parent(); // note: a variable was declared and initialized with object instance
        System.out.println("\n Parent.staticBool=" + Parent.staticBool + " p3.staticBool=" + p3.staticBool);

        System.out.println("\n\n // example 4 - overloaded constructor changes static variable for all!");
        Parent p4 = new Parent(false);
        System.out.println("\n Parent.staticBool=" + Parent.staticBool + " p3.staticBool=" + p3.staticBool + " p4.staticBool=" + p4.staticBool);

        System.out.println("\n\n public static void Parent.main()");

    }
}

// note: static is like a global variable for all classes/objects
// access controls
