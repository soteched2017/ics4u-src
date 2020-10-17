/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearch;
import java.io.*;
import java.util.*;
/**
 *
 * @author Tigger
 */
public class BinarySearch {
    static int numSearches;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> colours = new ArrayList <String>();
        BufferedReader br = null;

        try {
            // String path = "./"; // NetBeans
            String path = "./unit3/BinarySearchFileRead/"; // repl.it
            br = new BufferedReader(new FileReader(path + "colours.txt"));
            String word;
            while ((word = br.readLine()) != null ){
                colours.add(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        String [] colourList = new String[colours.size()];
        colours.toArray(colourList);


        System.out.println ("Binary search for green: " + binarySearch(colourList, 0, colourList.length-1, "green"));
        System.out.println ("Number of searches: " + numSearches);
        numSearches = 0;

        System.out.println ("Binary search for orange: " + binarySearch(colourList, 0, colourList.length-1, "orange"));
        System.out.println ("Number of searches: " + numSearches);
        numSearches = 0;

        System.out.println ("Binary search for pink: " + binarySearch(colourList, 0, colourList.length-1, "pink"));
        System.out.println ("Number of searches: " + numSearches);
        numSearches = 0;

        System.out.println ("Binary search for salmon: " + binarySearch(colourList, 0, colourList.length-1, "salmon"));
        System.out.println ("Number of searches: " + numSearches);
        numSearches = 0;
    }

    /** precondition: Array A must be sorted in alphabetical order
     * Parameters: A - sorted array
     * left - leftmost index in array
     * right - rightmost index in array
     * V - item to be looked for in the array
     */
     public static Boolean binarySearch(String [] A, int left, int right, String V){
         int middle;
         numSearches ++;
         if (left > right) {
             return false;
         }

         middle = (left + right)/2;
         int compare = V.compareTo(A[middle]);
         if (compare == 0) {
             return true;
         }
         if (compare < 0) {
             return binarySearch(A, left, middle-1, V);
         } else {
             return binarySearch(A, middle + 1, right, V);
         }
     }
}
