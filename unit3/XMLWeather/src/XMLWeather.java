/**
 *
 * unit 3 examples for computer science, 12 
 * 
 * XOM XML Library example - xom-1.2.6.jar
 * http://www.xom.nu/tutorial.xhtml see exapmle 7
 * http://www.xom.nu
 *
 * modified     20201017
 * date         20201011
 * @filename	XMLWeather.java
 * @author      unknown and vmso - virtual mr. so
 * @version     1.0
 * @see         3.5 content 3/3
 */

// package xmlweather;

import java.io.*;
import nu.xom.*;

// this is the old demo that doesn't work

public class XMLWeather {
    int[] highTemp = new int[6];
    int[] lowTemp = new int[6];
    String[] conditions = new String[6];
    
    public XMLWeather() throws ParsingException, IOException {
        // get the XML document from the web
        Builder builder = new Builder();
        Document doc = builder.build("http://tinyurl.com/47et6hf");
        // get root element, <forecast>
        Element root = doc.getRootElement();
        // get <simpleforecast> element
        Element simple = root.getFirstChildElement("simpleforecast");
        // get the <forecastday> elements
        Elements days = simple.getChildElements("forecastday");
        for (int current = 0; current < days.size(); current++) {
            // get current <forecastday>
            Element day = days.get(current);
            // get current <high>
            Element high = day.getFirstChildElement("high");
            Element highF = high.getFirstChildElement("fahrenheit");
            // get current <low>
            Element low = day.getFirstChildElement("low");
            Element lowF = low.getFirstChildElement("fahrenheit");
            // get current <icon>
            Element icon = day.getFirstChildElement("icon");
            // store values in object variables
            lowTemp[current] = -1;
            highTemp[current] = -1;
            try {
                lowTemp[current] = Integer.parseInt(lowF.getValue());
                highTemp[current] = Integer.parseInt(highF.getValue());
            } catch (NumberFormatException nfe) {
                // do nothing
            }
            conditions[current] = icon.getValue();
        }
    }

    public void display() {
        for (int i=0; i<conditions.length; i++) {
            System.out.println("Day " + i);
            System.out.println("\tConditions: " + conditions[i]);
            System.out.println("\tHigh: " + highTemp[i]);
            System.out.println("\tLow: " + lowTemp[i]);
        }
    }

    public static void main(String[] args) {
        try {
            XMLWeather weather = new XMLWeather();
            weather.display();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}


