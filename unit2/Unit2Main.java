/**
 *
 * unit 2 examples for computer science, 12 
 *
 *
 * modified     20200920
 * date         20200920
 * @filename	Unit2Main.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 2 content
 */

package unit2;

import java.util.ArrayList; // for 2.6 content


public class Unit2Main {

    public static void main(String[] args) {

        // print2(); // prints 2.2 content
        // print3();
        // print4();
        // print5();
        print6();

        // note: 2.1 and 2.6 have no Java coding content

    }

    /**
    * 2.2 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.2 content
    */
    public static void print2() {

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 2.2 arrays");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("// example 1 method 1 - declare, initialize, and list values using variables (vars)");

        String student0 = "Lisa"; 
        String student1 = "Maggie";
        String student2 = "Todd";
        String student3 = "Rod";
        String student4 = "Milhouse";
        String student5 = "Tom";
        String student6 = "Jerry";
        String student7 = "Bob";
        String student8 = "Billy";
        String student9 = "Suzie";
        String student10 = "Brittany";
        String student11 = "Alyssa";
        String student12 = "Brandy";
        String student13 = "Andrew";
        String student14 = "Tim";
        String student15 = "Sam";
        String student16 = "Sarah";
        String student17 = "Alex";
        String student18 = "Molly";
        String student19 = "Adam";

        System.out.println(student0);
        System.out.println (student1);
        System.out.println (student2);
        System.out.println (student3);
        System.out.println (student4);
        System.out.println (student5);
        System.out.println (student6);
        System.out.println (student7);
        System.out.println (student8);
        System.out.println (student9);
        System.out.println (student10);
        System.out.println (student11);
        System.out.println (student12);
        System.out.println (student13);
        System.out.println (student14);
        System.out.println (student15);
        System.out.println (student16);
        System.out.println (student17);
        System.out.println (student18);
        System.out.println (student19);


        System.out.println("// example 1 method 2 - declare, initialize, and list values using an Array");

        // notice: the example had a type Student should  be lowercase student
        // below, name changdd to studentA
        String[] studentA = new String[20]; // same as below
        // String studentA [] = new String[20]; // same as above
        studentA[0] = "Lisa";
        studentA[1] = "Maggie";
        studentA[2] = "Todd";
        studentA[3] = "Rod";
        studentA[4] = "Milhouse";
        studentA[5] = "Tom";
        studentA[6] = "Jerry";
        studentA[7] = "Bob";
        studentA[8] = "Billy";
        studentA[9] = "Suzie";
        studentA[10] = "Brittany";
        studentA[11] = "Alyssa";
        studentA[12] = "Brandy";
        studentA[13] = "Andrew";
        studentA[14] = "Tim";
        studentA[15] = "Sam";
        studentA[16] = "Sarah";
        studentA[17] = "Alex";
        studentA[18] = "Molly";
        studentA[19] = "Adam";


        System.out.println("// example 1 method 2 - declare, initialize, and list values using an Array on one line");
        String[] studentB = {"Lisa", "Maggie", "Todd", "Rod", "Milhouse"};

        System.out.println("// example 2 accessing Array elements");
        System.out.println(studentA[1]); // displays Maggie
        System.out.println(studentB[1]); // displays Maggie
        // elements are indexed starting from 0

        System.out.println("// example 2 iterate through Array elements");
        for (int i = 0; i < studentA.length; i++) {
            System.out.println(i + ": " + studentA[i]);
        }       

        System.out.println("// practice answer");

        String[] fruits = {"apple", "banana", "pear", "grapes", "kiwi"};

        for (int x=0; x <= 4; x++) {
            System.out.println(fruits[x]);
        }

        System.out.println();
        System.out.println("// see StudentRecords in ide-project/netbeans-12");
        System.out.println("// see StudentRecords in ide-project/eclipse-2020-06");
        System.out.println();
        System.out.println("// assignment 2.2 starter project,");
        System.out.println("// see SumElement in ide-project/eclipse-2020-06");                
    }


    /**
    * 2.3 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.3 content and assignment
    */
    public static void print3() {

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 2.3 content & assignment");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("// see MatchingGame in ide-project/netbeans-12");

    }


    /**
    * 2.4 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.4 content
    */
    public static void print4() {

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 2.4 content");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("\n\n// example 1");
        System.out.println("Two-Dimensional Array");
        System.out.println("row = 3, three rows");
        System.out.println("col = 2, two columns");
        System.out.println("colums are: quanity, price");
        
        int row = 3; 
        int col = 2; // qty, sellingPrice
        double [ ][ ] inventory = new double [row][col];
        
        /*
        quantity, sellingPrice
        1, $1.00
        2, $2.00
        3, $3.00
        */

        inventory[0][0] = 1;
        inventory[0][1] = 1.00;
        System.out.println(inventory[0][0] + ", " + inventory[0][1]);
        
        inventory[1][0] = 2;
        inventory[1][1] = 2.00;
        System.out.println(inventory[1][0] + ", " + inventory[1][1]);
        

        inventory[2][0] = 3;
        inventory[2][1] = 3.00;
        System.out.println(inventory[2][0] + ", " + inventory[2][1]);

        System.out.println("\n\n// example 2");
        // somewhere in the main program
        displayArray(); // call the function
        
        System.out.println("\n\n// example 3");
        // somewhere in the main program
        totalArray(); // call the function
    }



    /*  
    This function displays the contents of the array
    pre:  A two dimensional array must exist
    post: The contents of the array will be displayed
    (note: use javadoc format instead - vmso)
    */ 
    static public void displayArray(){

        System.out.println("displayArray start");

        //2D array with the following information
        double [ ][ ] inventory = new double [3][2];

        inventory[0][0] = 10;              
        inventory[0][1] = 1.99;

        inventory[1][0] = 13;
        inventory[1][1] = 7.99;

        inventory[2][0] = 23;
        inventory[2][1] = 3.87;

        /*
        for (int row = 0; row <= 2; row++) {
            for( int col=0; col <= 1; col++) {
                System.out.println(inventory[row][col]);
            }
        }
        */

        // note: fixed line returns - vmso
        for (int row = 0; row <= 2; row++) {
            for( int col=0; col <= 1; col++) {
                System.out.print(inventory[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println("displayArray end");
    }


    /*  
    This function calculates the value of the inventory
    that is stored in the array
    pre:  A two dimensional array with inventory data exists
    post: The total value is displayed
    (note: use javadoc format instead - vmso)
    */
    public static void totalArray() {

        System.out.println("totalArray start");

        //2D array with the following information
        double [ ][ ] inventory = new double [3][2];

        inventory[0][0] = 10;              
        inventory[0][1] = 1.99;

        inventory[1][0] = 13;
        inventory[1][1] = 7.99;

        inventory[2][0] = 23;
        inventory[2][1] = 3.87;

        double total=0;
        for (int row = 0; row <= 2; row++) {
            total = total + (inventory[row][0] * inventory[row][1]);
        }    
        System.out.println("Total Value of Inventory: $"+ total);

        System.out.println("totalArray end");
    }


    /**
    * 2.5 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.5 content
    */
    public static void print5() {

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 2.5 content");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("// see TicTac in ide-project/netbeans-12");

    }


    /**
    * 2.6 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.6 content
    */
    public static void print6() {

        System.out.println();
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 2.6 content");
        System.out.println("//////////////////////////////////////////////////////");

        System.out.println("\n\n// defining an ArrayList");

        // java.util.ArrayList <String> stringAList = new java.util.ArrayList <String> ();
        // or 
        // import java.util.ArrayList;

        ArrayList <String> name = new ArrayList <String> ();

        System.out.println("\n\n// common methonds in ArrayList");

        String e = "e";
        int i = 0;
        int j = 1;

        name.add(e); // adds “e” to the end of the ArrayList
        name.add(e);
        name.add(e);
        name.add(i, e); // adds “e” at index “i" of the ArrayList
        name.set(i, e); // sets the element at index “i” to “e”
        name.get(i); // returns the object at index “i”
        name.contains(e); // returns True if the ArrayList contains “e”
        name.indexOf(e); // returns index of the first occurrence of “e”, or -1 if not there
        name.lastIndexOf(e); // returns index of the last occurrence of “e”, or -1 if not there
       
        name.remove(i); // removes the element at position “i”
        name.size(); // returns the number of elements in the ArrayList

        // name.removeRange(i, j); // removes elements from positions i thru j
        // actually, removeRange() is protected
        name.subList(i, j).clear(); // does the same

        name.size();

        name.clear(); // removes all elements in the ArrayList
        name.size();

        System.out.println();
        System.out.println("// see ObjectArrayExample_1 in ide-project/netbeans-12");
        System.out.println("// note: do not use _ understore in Class names");
        

        arrayListOfArrayList();

        System.out.println();
        System.out.println("// see ArrayListSolution in ide-project/netbeans-12");


        System.out.println();
        System.out.println("// see CarsExample in ide-project/netbeans-12");
        System.out.println("// see 2.6 CarsExample in .replit");
        System.out.println("// uses older swing libraries in Maven repo");
    }

    
    public static void arrayListOfArrayList() {

        // the ArrayList
        ArrayList <ArrayList<String>> myList = new 
        ArrayList <ArrayList<String>>();

        // the rows in ArrayList
        ArrayList <String> row1 = new ArrayList <String> ();
        ArrayList <String> row2 = new ArrayList <String> ();
        ArrayList <String> row3 = new ArrayList <String> ();
        ArrayList <String> row4 = new ArrayList <String> ();

        // add the information to the rows
        row1.add("2008");
        row1.add("Honda");
        row1.add("Prelude");
        row1.add("Gold");
        row1.add("1000");
        row2.add("2006");
        row2.add("Chrysler");
        row2.add("Caravan");
        row2.add("Blue");
        row2.add("44198");
        row3.add("2007");
        row3.add("Ford");
        row3.add("Explorer");
        row3.add("Red");
        row3.add("22550");
        row4.add("2000");
        row4.add("GM");
        row4.add("Oldsmobile");
        row4.add("Silver");
        row4.add("62852");

        // add the rows to the myList ArrayList
        myList.add(row1);
        myList.add(row2);
        myList.add(row3);
        myList.add(row4);

        /** Print the lists */
        for (int x=0; x<myList.size(); x++) {
            for (int y=0; y<=4; y++) {
                System.out.print (myList.get(x).get(y) + " ");
            }
            System.out.print ("\n \n");
        }
    }
   
}