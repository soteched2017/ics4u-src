/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchiteration;

/**
 *
 * @author Tigger
 */
public class BinarySearchIteration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] mySortedArray = {"black", "blue", "brown", "green", "orange", "peach", "purple", "red", "salmon", "white"};

        System.out.println("Binary Search: green " + binarySearch(mySortedArray, 0, mySortedArray.length-1, "green"));
        System.out.println("Binary Search: orange " + binarySearch(mySortedArray, 0, mySortedArray.length-1, "orange"));
        System.out.println("Binary Search: pink " + binarySearch(mySortedArray, 0, mySortedArray.length-1, "pink"));
        System.out.println("Binary Search: salmon " + binarySearch(mySortedArray, 0, mySortedArray.length-1, "salmon"));

    }

    /** precondition: Array A must be sorted in alphabetical order
     * parameters: A - sorted array
     * left - leftmost index in array
     * right - rightmost index in array
     * V - item to be looked for in array
     */
    public static Boolean binarySearch(String [] A, int left, int right, String V) {
        int middle;
        Boolean found = false;

        while (found == false && left <= right) {
            middle = (left + right)/2;
            int compare = A[middle].compareTo(V);
            if (compare == 0) {
                found = true;
            } else {
                if (compare >0) {
                    right = middle -1;
                } else {
                    left = middle + 1;
                }
            }
        }
        if (left > right) {
            return false;
        } else {
            return true;
        }
    }

}
