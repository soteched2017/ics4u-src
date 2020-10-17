/*
 * another class using Car objects
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 * 
 * repl.it
 * javac -d ide-project/netbeans-12/CarsExample/build/classes -cp ide-project/netbeans-12/CarsExample/lib/appframework-1.0.3.jar:ide-project/netbeans-12/CarsExample/lib/swing-worker-1.1.jar:ide-project/netbeans-12/CarsExample/lib/swing-layout-1.0.3.jar ide-project/netbeans-12/CarsExample/src/carsexample/CarsExampleApp.java ide-project/netbeans-12/CarsExample/src/carsexample/CarsExampleAboutBox.java ide-project/netbeans-12/CarsExample/src/carsexample/CarsExampleView.java
 * java -cp .:ide-project/netbeans-12/CarsExample/build/classes:ide-project/netbeans-12/CarsExample/lib/appframework-1.0.3.jar:ide-project/netbeans-12/CarsExample/lib/swing-worker-1.1.jar:ide-project/netbeans-12/CarsExample/lib/swing-layout-1.0.3.jar carsexample.CarsExampleApp
 * 
 * 
 * modified     20201016
 * date         20200915
 * @filename	ObjectArrayExample.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.1
 * @see         unit 2.6 object array
 */

//package objectarrayexample;
package carsexample;

import java.util.*;
/**
 *
 * @author School
 */
public class ObjectArrayExample {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	// example 1 - object = String
    	
        ArrayList<String> row1 = new ArrayList<String>();
        
        row1.add("A");
        row1.add("B");
        row1.add("C");
        System.out.println(row1);

        row1.add(1, "D");
        System.out.println(row1);

        row1.set(0, "E");
        System.out.println(row1);

        System.out.println(row1.get(0));
        System.out.println(row1.get(1));

        System.out.println(row1.contains("E"));
        System.out.println(row1.contains("A"));

        System.out.println(row1.indexOf("B"));
        System.out.println(row1.lastIndexOf("A"));

        row1.remove("B");
        System.out.println(row1);

        System.out.println(row1.size());

        row1.clear();
        System.out.println(row1);
        
        
        // example 2 - object = Car
        
        ArrayList<Car> carRow1 = new ArrayList<Car>();
        
        carRow1.add(new Car("2020", "Ford", "Mustang GT", "Electric Blue", "0"));
        carRow1.add(new Car("2020", "Ford", "Mustang GT", "Red", "0"));
        carRow1.add(new Car("2020", "Ford", "Mustang GT", "Black", "0"));
        
        for (int i = 0; i < carRow1.size(); ++i) {
	        System.out.println(carRow1.get(i).year);
	        System.out.println(carRow1.get(i).company);
	        System.out.println(carRow1.get(i).type); 	// type is usually make, model
	        System.out.println(carRow1.get(i).colour);
	        System.out.println(carRow1.get(i).mileage);
            System.out.println();
        }

    }

}
