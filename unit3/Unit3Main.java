/**
 *
 * unit 3 examples for computer science, 12 
 *
 *
 * modified     20201011
 * date         20201011
 * @filename	Unit3Main.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         unit 3 content
 */

package unit3;


public class Unit3Main {

    public static void main(String[] args) {

        print2(); // 3.2 content
        print3();
        // print4();
        // print5();
        // print6();

    }
    

    /**
    *
    * 3.2 content examples
    *
    */
    public static void print2() {

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 3.2 recursion");
        System.out.println("//////////////////////////////////////////////////////");
        
        System.out.println();
        System.out.println("// factorial 5");
        int num, fact;
        fact = 1;
        num = 5;
        for (int i=1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println ("Factorial (" + num + "!) is " + fact);

        // factorial 5 using recursion
        // int num = 5;
        System.out.println();
        System.out.println("// recursive solution of 5!");
        System.out.println("Factorial (" + num + "!) is " + fact(num));


        System.out.println();
        System.out.println("// greatest common denominator");
        int n1 = 27;
        int n2 = 18;

        int answer = gcd(n1, n2);

        System.out.println("the GCD of " + n1 + " and " + n2 + " is " + answer);

        
        System.out.println();
        System.out.println("// example 1 - Towers of Hanoi problem");

        int n = 8;
        String fromPeg = "A";
        String toPeg = "C";
        String tempPeg = "B";

        System.out.println("There are " + n + " discs on peg A initially ");
        hanoi (fromPeg, toPeg, tempPeg, n);

        System.out.println();
        System.out.println("// example 1 - Towers of Hanoi problem, also see ide-project/netbeans-12/Hanoi");
        

        System.out.println();
        System.out.println("// example 2 - word scramble");
        String letters = "NUF";
        System.out.println("Word Scramble \n");
        scrambleWords(letters, "");

        System.out.println();
        System.out.println("// example 2 - word scramble, also see ide-project/netbeans-12/WordScramble");

        System.out.println();
        System.out.println("// 3.2 assignments - must all use recursion");

    }


    /**
    *
    * 3.2 factorial
    *
    * @param    n   integer
    * @return   n!  the factorial of n
    */
    public static int fact (int n) {
        if (n == 0 || n ==1) {
            return 1;
        } else {
            return (n * fact(n-1));
        }
    }

    /**
    *
    * 3.2 greated common denominator
    *
    * @param    a   integer
    * @param    b   integer
    * @return       the gcd of a, b
    */
    static public int gcd (int a, int b) {
        if (b==0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    /**
    *
    * 3.2 towers of hanoi
    *
    *
    * @param    from    start position
    * @param    to      destination position
    * @param    temp    temporary position
    * @param    n       disc number
    * @see  https://www.mathsisfun.com/games/towerofhanoi.html
    */
    static public void hanoi (String from, String to, String temp, int n) {
        if (n ==1) {
            System.out.println("move disc 1 from " + from + " to " + to);
        } else {
            hanoi (from, temp, to, n-1);
            System.out.println("move disc " + n + " from " + from + " to " + to);
            hanoi (temp, to, from, n-1);
        }
    }

    /**
    *
    * 3.2 factorial
    *
    * @param    word                input string to be scrambled
    * @param    scrambledLetters    the scrambled word
    */
    static public void scrambleWords (String word, String scrambledLetters) {
        String remainingLetters;
        String origWord = word;
        String origscrambledLetters = scrambledLetters;

        if (word.length() == 1) {
            System.out.println(scrambledLetters + word);
        } else {
            for (int pos = 0; pos <origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos) +
                        origWord.substring(pos+1, origWord.length());

                scrambleWords(remainingLetters, origscrambledLetters 
                             + origWord.charAt(pos));
            }
        }
    }


    /**
    *
    * 3.3 content examples
    *
    */
    public static void print3() {

        System.out.println("//////////////////////////////////////////////////////");
        System.out.println("// 3.3 searching routines");
        System.out.println("//////////////////////////////////////////////////////");

        // linearSearch();
        // sortedLinearSearch();
        System.out.println();
        System.out.println("// 3.3 see LinearSearch NetBeans project");
        // java -cp unit3/LinearSearch/build/classes linearsearch.LinearSearch
        
        // binarySearch // recursive
        // binarySearchIteration
        // binarySearchFileRead

        System.out.println();
        System.out.println("// 3.3 see BinarySearch NetBeans project");
        // java -cp unit3/BinarySearch/build/classes binarysearch.BinarySearch

        System.out.println("// 3.3 see BinarySearchIteration NetBeans project");
        // java -cp unit3/BinarySearchIteration/build/classes binarysearchiteration.BinarySearchIteration

        // TO DO: fix path
        System.out.println("// 3.3 see BinarySearchFileRead NetBeans project");        
        // java -cp unit3/BinarySearchFileRead:unit3/BinarySearchFileRead/build/classes binarysearch.BinarySearch    

    }

    /**
    *
    * 3.3 linear search
    *
    * @param    A   search string
    * @param    V   find value
    */
    /*
    public static Boolean linearSearch(String [ ] A, String V) {
        for (int k=0; k<A.length; k++) {
            if (A[k].equals(V)) {
                return true;
            }
        }
        return false;
    }
    */

    /**
    *
    * 3.3 sorted linear search
    *
    * @param    A   sorted search string
    * @param    V   find value
    */
    /*
    public static Boolean sortedLinearSearch (String [ ] A, String V) {
        for (int k=0; k<A.length; k++) {
            int compare = A[k].compareTo(V);
            if (compare == 0) {
                return true;
            }
            if (compare > 0) {
                return false;
            }
        }
        return false;
    }
    */

    /**
    *
    * 3.3 binary search
    *
    * @param    A       sorted search string
    * @param    left    index
    * @param    right   index
    * @param    V       find value
    */
    /*
    public static Boolean binarySearch(String [ ] A, int left, int right, String V) {
         int middle;

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
     */


}