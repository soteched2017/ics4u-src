/**
 *
 * unit 1 examples for computer science, 12 
 *
 *
 * modified     20200919
 * date         20200705
 * @filename	Unit1Main.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 1 content
 */

package unit1;


public class Unit1Main {

    public static void main(String[] args) {

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.3 example 1");
        System.out.println("//////////////////////////////////////////////////////");
        new unit1.helloworld.HelloWorld().main(null);


        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.3 example 2");
        System.out.println("//////////////////////////////////////////////////////");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true); // shows window
        new unit1.helloworld.HelloWorldGui();

        
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.4 variables, data types, constants, and operators");
        System.out.println("//////////////////////////////////////////////////////");
        
        // combine in one statement:
        // double origXScale;
        // origXScale = 10.5;
        double origXScale = 10.5;

        // vmso note: primitive vs. object
        doStuff(100); // primitive, int
        doStuff(200d); // primitive, double
        doStuff(new Double(300)); // object, Double is a wrapper object
        // System.out.println( (100).toString() ); // error: int cannot be dereferenced
        System.out.println( String.valueOf(100) );
        // System.out.println( (200d).toString() ); // error: double cannot be dereferenced
        System.out.println( String.valueOf(200d) );
        System.out.println( new Double(300).toString() );
        
        int p = 0; // primitive
        Integer wo = new Integer(0); // wrapper object

        // autoboxing, converts from primitive to object
        double d = 10.41;
        Double wrapper = d;

        // constants
        final int MINIMUM_SCORE = 0;
        final int MAXIMUM_SCORE = 100;


        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.5 loops and selection structures");
        System.out.println("//////////////////////////////////////////////////////");

        // conditionals = selection structures 

        // syntax
        // for (initial value; condition; increment expression)  {   
        //     Statement 1; 
        //     Statement 2;
        // }

        System.out.println("example 1");
        System.out.println("Counting Up");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // syntax
        // while (condition) { 
        //     Statement 1; 
        //     Statement 2;
        // }

        System.out.println("example 2");
        int i = 1;
        while (i <6) {
            System.out.println(i);
            i++;
        }

        // if statement
        // example 1
        int myValue = 1;
        if (myValue == 1) {
            // doSomething();
        }

        // example 2
        if (myValue == 1) {
            // doSomething();
        } else if (myValue == 2) {
            // doSomethingElse();
        } else {
            // doNothing();
        }

        // example 4
        int switchExpression = 3;

        switch (switchExpression) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Not 0, 1, or 2");
        }

        // example 5
        int score = 0; 
        switch (score) {
            case 0:
                System.out.println("Better Luck next time.");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Pretty good.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Good!");
                break;
            default:
                System.out.println("Out of range");
                break;
        }


        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.6 functions");
        System.out.println("//////////////////////////////////////////////////////");

        // example 2
        System.out.println(Math.round(1.36));

        // example 2 - no parameter
        myFirstFunction();

        // example 2 - 1 parameter
        showParameter("hello world");

        // example 3 - return value
        int answer;
        answer = doubleNumber(10);
        System.out.println(answer);


         System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// swing GUI examples");
        System.out.println("//////////////////////////////////////////////////////");

        new unit1.CodedGUI();
        new unit1.NetBeansJFrameForm().main(null);

    }

    
    // example 1.4 functions
    // src: https://stackoverflow.com/questions/13332012/double-vs-double-in-java
    private static void doStuff(double d){ System.out.println("Primitive call"); }
    private static void doStuff(Double d){ System.out.println("Object call"); }


    // example 1.6 functions
    public static void myFirstFunction( ){ 
        // (Block of code goes here)
        ;
    }

    public static void showParameter(String aParam){
        System.out.println(aParam);
    }

    public static int doubleNumber(int baseNumber){
        return (baseNumber * 2);
    }

    
}