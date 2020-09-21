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


public class Unit2Main {

    public static void main(String[] args) {

        print2(); // prints 2.2 content
        pinrt3(); 

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
        System.out.println("// 1.1 arrays");
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

        System.out.println("// see StudentRecords in ide-project/netbeans-12");
    }


    /**
    * 2.3 content examples
    *
    * @param        none
    * @return       none
    * @exception    none
    * @see          2.3 content
    */
    public static void print3() {
        
}