/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistexample;
import java.util.*;
/**
 *
 * @author School
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <ArrayList<String>> myList = new ArrayList <ArrayList<String>>();
         ArrayList <String> row1 = new ArrayList <String> ();
         ArrayList <String> row2 = new ArrayList <String> ();
         ArrayList <String> row3 = new ArrayList <String> ();
         ArrayList <String> row4 = new ArrayList <String> ();
         ArrayList <String> row5 = new ArrayList <String> ();

         /** Add the information to the rows */
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
         row5.add ("2007");
         row5.add ("Chrysler");
         row5.add ("Calibre");
         row5.add ("Black");
         row5.add ("85465");
         /** Add the rows to the myList ArrayList */
         myList.add(row1);
         myList.add(row2);
         myList.add(row3);
         myList.add(row4);
         myList.add(row5);

         /** Print the lists */
         for (int x=0; x<myList.size(); x++) {
             System.out.println("Vehicle " + (x+1));
             for (int y=0; y<=4; y++) {
                 if (y==0) {
                     System.out.println("Year - " + myList.get(x).get(y));
                 } else if (y==1) {
                     System.out.println("Make - " + myList.get(x).get(y));
                 } else if (y==2) {
                     System.out.println ("Model - " + myList.get(x).get(y));
                 } else if (y==3) {
                     System.out.println ("Colour - " + myList.get(x).get(y));
                 } else {
                     System.out.println ("Mileage - " + myList.get(x).get(y));
                 }
             }
             System.out.println();
         }
         
    }

}
