/**
 * compile multiple classes but can execute only 1 main()
 * 
 * examples for computer science, 12 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201026
 * date         20201026
 * @filename	MultipleMainMethod.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */
 
 class MultipleMainMethod {

    public static void main (String[] args) {
        
        System.out.println("public static void MultipleMainMethod.main() called");

    }
}


class Subclass extends MultipleMainMethod {

    public static void main (String[] args) {
        
       System.out.println("public static void Subclass.main() called");

    }
}


class AnotherClass0 {

    public static void main (String[] args) {
        
        System.out.println("public static void AnotherClass0.main() called");

    }
}


class AnotherClass1 {

    public static void main (String[] args) {
        
        System.out.println("public static void AnotherClass1.main() called");

    }
}

// compiles all classes within file:
// javac MultipleMainMethod.java 

// run a specified main() method:
// java MultipleMainMethod
// java Subclass
// java AnotherClass0
// java AnotherClass1

