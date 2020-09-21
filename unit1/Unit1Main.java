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
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true); // repl.it glitch, shows window title bar
        new unit1.helloworld.HelloWorldGui();

        
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.4 variables, data types, constants, and operators");
        System.out.println("//////////////////////////////////////////////////////");
        
        
        System.out.println("// 1.4 content (1/5)");
        System.out.println("/////////////////////");
       
        System.out.println("// variable declaration, initialization");
        // double origXScale; // declaration
        // origXScale = 10.5; // initialization
        // above, combined in one statement:
        double origXScale = 10.5;


        System.out.println("// variable names");

        System.out.println("// first character is $, _, or a lowercase letter");
        int $variableName;
        int _variableName;
        int variableName;
         System.out.println("// typically, only use letters and numbers");


        System.out.println("// constants");        
        final int MINIMUM_SCORE = 0;
        final int MAXIMUM_SCORE = 100;


        System.out.println("// date types: primitive vs reference");

        System.out.println("// vmso notes on: primitive vs. reference");

        System.out.println("// reference types refers to class objects, see the picture 'Primitive vs Reference Type Java.png'");
        // src: https://1.bp.blogspot.com/-bpbdwrvRSaw/VflqVT6GaxI/AAAAAAAADxU/BSi7bF7ef34/s1600/Primitive%2Bvs%2BReference%2BType%2BJava.png
        
        doStuff(100); // primitive, int
        doStuff(200d); // primitive, double
        doStuff(new Double(300)); // reference, Double is a wrapper object
        // System.out.println( (100).toString() ); // error: int cannot be dereferenced
        System.out.println( String.valueOf(100) );
        // System.out.println( (200d).toString() ); // error: double cannot be dereferenced
        System.out.println( String.valueOf(200d) );
        System.out.println( new Double(300).toString() );
        
        int p = 0; // primitive
        Integer wo = new Integer(0); // reference

        System.out.println("// autoboxing vs. unboxing");

        // autoboxing, automatically converts from primitive to reference
        double d = 10.41;
        Double wrapper = d;

        // unboxing, converts from reference to primitive
        d = new Double(10d);
        

        System.out.println("// local and global scope");

        System.out.println("// local scope");
        for (int i = 0; i < 10; ++i) // local variable
            System.out.print(i);
        System.out.println();

        System.out.println("// global scope");
        System.out.println(i); // global variable is initialized, below        


        System.out.println("// 1.4 content (2/5)");
        System.out.println("/////////////////////");

        System.out.println("// example 1 type casting");
        String aString = "100";
        String bString = "99.999";
        double aDouble = 7.785;
        double bDouble = Double.parseDouble(bString);
        int aInteger = Integer.parseInt(aString);
        double cDouble = (double) aInteger;
        String cString = Integer.toString(aInteger);
        String dString = Double.toString(cDouble);
        System.out.println("This is the first String: " + aString);
        System.out.println("This is the second String: " + bString);
        System.out.println("This is the first Double: " + aDouble);
        System.out.println("This is a Double variable from the second String: " + bDouble);
        System.out.println("This is an Integer from the first String: " + aInteger);
        System.out.println("This is a Double from a casted Integer: " + cDouble);
        System.out.println("This is an Integer converted to a String: " + cString);
        System.out.println("This is a Double converted to a String: " + dString);


        System.out.println("// example 2 rounding");
        System.out.println (Math.round(204.999)); // displays 205
        System.out.println (Math.round(204.499)); // displays 204


        System.out.println("// 1.4 content (3/5)");
        System.out.println("/////////////////////");

        System.out.println("// check your understanding - math operators");
        double score, answer1, answer2, answer3, answer4, answer5, answer6;
        double answer7, answer8, answer9, answer10, answer11, answer12;
        score = 10;
        System.out.println("answer 1: " + score); 
        score = score +  2;
        System.out.println ("answer 2: " + score); 
        score++;
        System.out.println ("answer3 : " + score); 
        score = score - 5;
        System.out.println ("answer 4: " + score); 
        score-- ;
        System.out.println ("answer 5: " + score); 
        score = score * 2;
        System.out.println ("answer 6: " + score); 
        score = score % 5;
        System.out.println ("answer 7: " + score); 
        score += 7;
        System.out.println ("answer 8: " + score); 
        score -= 2;
        System.out.println ("answer 9: " + score); 
        score *= 2;
        System.out.println ("answer 10: " + score); 
        score /= 2;
        System.out.println ("answer 11: " + score); 
        score %= 2;
        System.out.println ("answer 12: " + score);

        System.out.println("B,E,DM,AS or BEDMAS");
        System.out.println(18 / 3 - 2 + 4 * 2);
        // 18 / 3 - 2 + 4 * 2
        // = 6 - 2 + 4 * 2
        // = 6 - 2 + 8
        // = 4 + 8
        // = 12
        
        System.out.println("check your understanding");
        double drink = 1.50;
        double meal = 9.99;
        final double hst = .13; // was const, error in content

        double totalCost = (drink + meal) + ((drink + meal) * (hst));
        // totalCost = (drink + meal) * (1. + hst);
        
        System.out.println("he total cost is: " + totalCost);

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.4 content 5/5 DivModApp");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("// 1.4 content 5/5 DivModApp code only");
        
        System.out.println("// DivModApp works from the console before hooking up a GUI");

        String text1,text2;
        int int1, int2;
        
        text1 = "10"; // txtInteger1.getText(); 
        text2 = "2"; // txtInteger2.getText();
        int1 = Integer.parseInt(text1);
        int2 = Integer.parseInt(text2);
        
        // txtOutput1.setText(int1 + "/" +int2+'='+int1/int2);
        // txtOutput2.setText(int1 + "%" +int2+'='+int1%int2);
        // txtOutput3.setText(int2 + "/" +int1+'='+int2/int1);
        // txtOutput4.setText(int2 + "%" +int1+'='+int2%int1);

        System.out.println(int1 + "/" +int2+'='+int1/int2);
        System.out.println(int1 + "%" +int2+'='+int1%int2);
        System.out.println(int2 + "/" +int1+'='+int2/int1);
        System.out.println(int2 + "%" +int1+'='+int2%int1);

        System.out.println("// notice: DivModApp GUI has exception handling and output fields are not editable");

        System.out.println("// notice: see ide-project folders for");   
        System.out.println("// DivModApp GUI in Eclipse 2020.06");
        System.out.println("// DivModApp GUI in NetBeans 12.0");
        System.out.println("// DivModApp GUI in IntelliJ IDEA (Edu) 2020.1.2");



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
        int iscore = 0;
        switch (iscore) {
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
        System.out.println("// 1.5.1 assignment final output");
        System.out.println("//////////////////////////////////////////////////////");
        int myNum = 11;
        int mySum = 0;

        while (myNum >= 0) 
        {
            myNum--;
            mySum += myNum * 5;
        }

        System.out.println ("myNum: " + myNum);
        System.out.println ("mySum: " + mySum);



        // assignment 1.5.2 to do:
        // students should generate their own GUIs
        // manually, and in an IDE: Eclipse, IntelliJ, and NetBeans
        // there's an example that was copied from Eclipse, see the folder
        

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.6 functions or methods");
        System.out.println("//////////////////////////////////////////////////////");

        // example - no parameter
        System.out.println("// System.out.println() method called without a paramter");
        System.out.println(); // outputs a blank line
        myFirstFunction();

        // example - 1 parameter
        System.out.println("// 1.6 example 2");
        System.out.println("// Math.round() method requires paramter");   System.out.println(Math.round(1.36));
        showParameter("hello world");

        // example - return value
        int answer;
        answer = doubleNumber(10);
        System.out.println(answer);

        System.out.println("// some existing math methods");

        System.out.println("// 1. Math.max() - compares two values and returns the largest value");
        System.out.println(Math.max(0, 1));
        // the content incorrectly stated > 2 values or parameters

        System.out.println("// 2. Math.pow() - computes and returns the first value to the power of the second value");
        System.out.println(Math.pow(0, 1));

        System.out.println("// 3. Math.random() - returns a pseudo-random number that is greater than zero and less than one");
        System.out.println(Math.random());

        System.out.println("// 4. Math.round() - rounds a value up or down to the nearest integer and returns the value");
        System.out.println(Math.round(2.51));

        System.out.println("// 5. Math.sqrt() - returns the square root of a specific number");
        System.out.println(Math.sqrt(2));

        System.out.println("// 6. Math.abs() - returns the absolute value of a number");
        System.out.println(Math.abs(-1));

        System.out.println("// 7. Math.ceil() - computes and returns the smallest integer greater than, or equal to, the number");
        System.out.println(Math.ceil(-1));

        System.out.println("// 8. Math.floor() - computes and returns the largest integer less than, or equal to, the number");
        System.out.println(Math.floor(-1));

        System.out.println("// 9. Math.min() - compares two numbers and returns the smallest");
        System.out.println(Math.min(-1,1));

        // to do: look up more Math class methods

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.6 check your understanding");
        System.out.println("//////////////////////////////////////////////////////");
        double randomNumber;

        randomNumber = Math.random() * 10;

        System.out.println("The random number generated is: " + randomNumber + "\n");


         System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 1.6 functions");
        System.out.println("//////////////////////////////////////////////////////");
        
        myFirstFunction(); // no param
        
        showParameter("fn called with a parameter"); // a string param

        // returns twice the paramter int
        System.out.println(doubleNumber(2)); // an int param
        // doubleNumber is a bad function name because double is also a primitive type


        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// swing GUI examples");
        System.out.println("//////////////////////////////////////////////////////");

        // manually coded
        new unit1.GuiCoded(); 

        // using NetBeans drag-and-drop
        new unit1.GuiNetBeans().main(null);

    }

    ///////////////////////////////
    // example 1.4 global variable
    // see, local and global scope
    ///////////////////////////////
    static int i = -1; // global variable

    /////////////////////////
    // example 1.4 functions
    /////////////////////////

    // src: https://stackoverflow.com/questions/13332012/double-vs-double-in-java
    private static void doStuff(double d) {  
        System.out.println("Primitive call"); 
    }

    private static void doStuff(Double d) { 
        System.out.println("Object call"); 
    }


    /////////////////////////
    // example 1.6 functions
    /////////////////////////

    public static void myFirstFunction( ) { 
        // (Block of code goes here)
        ;
    }

    public static void showParameter(String aParam) {
        System.out.println(aParam);
    }

    public static int doubleNumber(int baseNumber) {
        return (baseNumber * 2);
    }

    
}