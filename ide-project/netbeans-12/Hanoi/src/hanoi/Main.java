/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hanoi;

/**
 *
 * @author School
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 8;
        String fromPeg = "A";
        String toPeg = "C";
        String tempPeg = "B";

        System.out.println("Towers of Hanoi problem");
        System.out.println("There are " + n + " discs on peg A initially ");
        hanoi (fromPeg, toPeg, tempPeg, n);

    }
    static public void hanoi (String from, String to, String temp, int n) {
        if (n ==1) {
            System.out.println("Move disc 1 from " + from + " to " + to);
        } else {
            hanoi (from, temp, to, n-1);
            System.out.println("Move disc " + n + " from " + from + " to " + to);
            hanoi (temp, to, from, n-1);
        }
    } 

}
