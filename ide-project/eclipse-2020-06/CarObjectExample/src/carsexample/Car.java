package carsexample;


public class Car {
	
    String year, company, type, colour, mileage;

    Car (String _year, String _company, String _type, String _colour, String _mileage) {
        year = _year;
        company = _company;
        type = _type;
        colour = _colour;
        mileage = _mileage;
    }
}


/*

// a better class would be:

public class Car { // class name is singular, capitalized, was cars

	// make properties private
    private String year, company, type, color, mileage; // use the US spellings

    Car (String _year, String _company, String _type, String _colour, String _mileage) {
        year = _year;
        company = _company;
        type = _type;
        color = _colour;
        mileage = _mileage;
    }
    
    // use public get/setter methods
     
    public String getYear();
    public void setYear(String y);
    
}


 */
