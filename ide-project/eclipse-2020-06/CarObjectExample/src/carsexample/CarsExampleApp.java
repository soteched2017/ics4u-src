/*
 *
 * https://github.com/soteched2017/ics4u-src
 * https://repl.it/@soteched2017/ics4u-src#Main.java
 * 
 * repl.it
 *
 * javac -d ide-project/eclipse-2020-06/CarObjectExample/bin -cp ide-project/eclipse-2020-06/CarObjectExample/lib/appframework-1.0.3.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-worker-1.1.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-layout-1.0.3.jar ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/CarsExampleApp.java ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/CarsExampleAboutBox.java ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/CarsExampleView.java ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/Car.java ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/ObjectArrayExample.java 
 *
 * cp -r ide-project/eclipse-2020-06/CarObjectExample/src/carsexample/resources ide-project/eclipse-2020-06/CarObjectExample/bin/carsexample/ 
 *
 * java -cp .:ide-project/eclipse-2020-06/CarObjectExample/bin:ide-project/eclipse-2020-06/CarObjectExample/lib/appframework-1.0.3.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-worker-1.1.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-layout-1.0.3.jar carsexample.CarsExampleApp
 *
 * java -cp .:ide-project/eclipse-2020-06/CarObjectExample/bin:ide-project/eclipse-2020-06/CarObjectExample/lib/appframework-1.0.3.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-worker-1.1.jar:ide-project/eclipse-2020-06/CarObjectExample/lib/swing-layout-1.0.3.jar carsexample.ObjectArrayExample
 * 
 * note: replaced the java source files in the original NetBeans project, CarExample
 *
 * modified     20201016
 * date         20200915
 * @filename	CarsExampleApp.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.1
 * @see         unit 2.6 object array
 */

package carsexample;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class CarsExampleApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new CarsExampleView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of CarsExampleApp
     */
    public static CarsExampleApp getApplication() {
        return Application.getInstance(CarsExampleApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(CarsExampleApp.class, args);
    }
}
