/* 
 * Array: references, copy, print
 * 
 * grade 11 cs review 
 * Toronto, Canada
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 *
 * modified     20201102
 * date         20201102
 * @filename	ArrayExample.java
 * @author      vmso
 * @version     1.0
 * @see         units 1 through 4 content
 */

class ArrayExample {

    public static void main (String[] args) {

        printArrayHints();
        
        print22(); // assignment 2.2 hints

    }

    public static void printArrayHints() {

        System.out.println("===============================");
        System.out.println(" Array hints");
        System.out.println("===============================");

        int[] iA = { 1, 2, 3};

        int[] iB = iA;  // points to the same array; different variables but same array object
        
        System.out.println("\n\nsame memory address, different variables access the same array:"); 
        System.out.println("iA = " + iA); 
        System.out.println("iB = " + iB);
        System.out.println("iA = " + java.util.Arrays.toString(iA)); 
        System.out.println("iB = " + java.util.Arrays.toString(iB));

        (new ArrayExample()).methodArrayParameter(iA, iB); // array as method parameter
        System.out.println("back in printArrayHints(), notice that methods change arrays that have been passed as parameters");
        System.out.println("iA = " + java.util.Arrays.toString(iA)); 
        System.out.println("iB = " + java.util.Arrays.toString(iB));


        iA[2] = 1; // changes to either variable (iA or iB) affect both variables (the same array)
        iB[1] = 1;
        iA[0] = 1;

        System.out.println("\n\nsame memory address, different variables access the same array:"); 
        System.out.println("iA = " + iA); 
        System.out.println("iB = " + iB);
        System.out.println("iA = " + java.util.Arrays.toString(iA)); 
        System.out.println("iB = " + java.util.Arrays.toString(iB));

        iB = iA.clone(); // clones or copies the original array; different variables and arrays
        iB[2] = 2;
        iB[1] = 2;
        iB[0] = 2;

        System.out.println("\n\ndifferent memory address, different array objects:"); 
        System.out.println("iA = " + iA); 
        System.out.println("iB = " + iB);
        System.out.println("iA = " + java.util.Arrays.toString(iA)); 
        System.out.println("iB = " + java.util.Arrays.toString(iB));

        // prints multidimensional arrays
        System.out.println("\n\nprinting multidimensional arrays:"); 
        int[][] array2d = { {0,0}, {0,1} };
        System.out.println("array2d = " + java.util.Arrays.deepToString(array2d)); 
        int[][][] array3d = { {{0,0,0}, {1,2,3}}, {{1,1,1}} };
        System.out.println("array3d = " + java.util.Arrays.deepToString(array3d));        

        // array length vs size()

        for (int i=0; i < iA.length; ++i) // length is a property not a method
            ;

        java.util.ArrayList<Integer> iAL = new java.util.ArrayList<>();
        /*
        for (int i=0; i < iAL.size(); ++i) // size is a method not a property
            ;
        */
        int len = iAL.size();
        for (int i=0; i < len; ++i) // note: len is not calculated each iteration
            ;


        // to do: using Array vs List vs ArrayList 
        // https://stackoverflow.com/questions/716597/array-or-list-in-java-which-is-faster
        // note: ArrayList implements List
    }

    void methodArrayParameter(int[] a, int[] b) {
        System.out.println("\n\nmethodArrayParameter: same memory address, different variables access the same array:"); 
        System.out.println("a = " + a); 
        System.out.println("b = " + b);
        a[0] = -999;
        b[0] = -1000;
        System.out.println("a = " + java.util.Arrays.toString(a)); 
        System.out.println("b = " + java.util.Arrays.toString(b)); 
    }

    public static void print22() {

        // assignment 2.2 asked for Array but ArrayList was also accepted
        // note: there are differences with add/remove/methods because Array is a fixed size

        // here is a sample work breakdown in 2 parts
        
        // part 1: array input, processing, output (no GUI)
        // declaration/instantiation/initialization
        // add, iterate, remove, sum all/odd/even
        // sort was extra 
        // do small tests with 0, 1, 2, and 3 elements in an array before attempting to sort 100s like in unit 3

        // part 2: connecting array functionality to GUI (this was already covered in unit 1)
        // exception handling
        // converting input string to int
        // output read-only
        // notice: a GUI was already provided but only 1 student used it (https://repl.it/@soteched2017/ics4u-src#ide-project/eclipse-2020-06/SumElement/src/SumElement.java)


        System.out.println("===============================");
        System.out.println(" 2.2 add");
        System.out.println("===============================");

        // ArrayList.add(element);
        // Array[index] = element;


        System.out.println("===============================");
        System.out.println(" 2.2 iterating");
        System.out.println("===============================");
        
        // method 0: for loop

        // method 1: using iterator()
        java.util.ArrayList<String> al = new java.util.ArrayList<String>();
        al.add("2");
        al.add("25");
        al.add("4");
        String a = "", temp = "";
        java.util.Iterator stepper = al.iterator();
        while (stepper.hasNext()) {
            a = (String) stepper.next();
            temp = temp + a + "\n";
        }
        System.out.println(temp);

        // method 2: https://www.geeksforgeeks.org/iterating-arrays-java/
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; 
        int x; 
        for (int i : ar) { 
            x = i; 
            System.out.print(x + " "); 
        } 
        System.out.println();


        System.out.println("===============================");
        System.out.println(" 2.2 sum all");
        System.out.println("===============================");
        
        // note: ArrayList vs Array
        // https://stackoverflow.com/questions/16242733/sum-all-the-elements-java-arraylist
        // https://beginnersbook.com/2014/01/java-program-to-sum-the-elements-of-an-array/

        System.out.println("\n\n sum using a stream");
        int[] a0 = {-1,0,1,2,3};
        int a0Sum = java.util.Arrays.stream(a0).sum();
        System.out.println(Integer.toString(a0Sum));

        System.out.println("\n\n print using a stream");
        java.util.stream.IntStream stream = java.util.Arrays.stream(a0);
        stream.forEach(i -> System.out.print(i + " ")); // or \n
        System.out.println();


        System.out.println();
        System.out.println("===============================");
        System.out.println(" 2.2 sum odd/even ");
        System.out.println("===============================");

        // https://www.sanfoundry.com/java-program-calculate-sum-odd-even/
        // https://www.geeksforgeeks.org/sum-even-odd-elements-array/


        System.out.println("===============================");
        System.out.println(" 2.2 remove ");
        System.out.println("===============================");

        // ArrayList.remove(element);
        // Array: https://www.geeksforgeeks.org/remove-an-element-at-specific-index-from-an-array-in-java/
        

        System.out.println("===============================");
        System.out.println(" 2.2 sort");
        System.out.println("===============================");

        System.out.println("\n\n Collections.sort() but the assignment didn't require sort");

        System.out.println("java.util.ArrayList<String> ");
        java.util.ArrayList<String> strArr = new java.util.ArrayList<String>();
        strArr.add("2");
        strArr.add("25");
        strArr.add("4");
        System.out.println(strArr.toString());
        java.util.Collections.sort(strArr);
        System.out.println(strArr.toString());

        System.out.println("java.util.ArrayList<Integer> ");
        java.util.ArrayList<Integer> numArr = new java.util.ArrayList<Integer>();
        numArr.add(2);
        numArr.add(25);
        numArr.add(4);
        System.out.println(numArr.toString());
        java.util.Collections.sort(numArr);
        System.out.println(numArr.toString());
        
        
        // other considerations:
        // comment header and no unnecessary/confusing comments (often, code was clearer and more concise than comments)
        // exception handling
        // converting input strings to int
        // clear, concise GUI

    }
}