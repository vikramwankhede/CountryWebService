package client;

/*
 * @author vikram wankhede
 * @date 8/5/2015
 */
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
// This class is used for the web service
public class Countries 
{
    // Arraylist datastructure is used to store the various country names
    List<Country> countries = new ArrayList<Country>();
    
    // Default constructor
    public Countries() 
    {
        super();
        
    }

    // The setter method is used to set the arraylist countries
    @WebMethod(exclude = true)
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    // Getter method to get countries
    public List<Country> getCountries() 
    {
        if (countries.size()==0) 
        {
            countries.add(new Country("CAN","CANADA"));
            countries.add(new Country("IN","INDIA"));
            countries.add(new Country("US","UNITED STATES"));
        }
        return countries;
    }
    
    // This method is used to add new countries.
    public boolean addCountry(Country country) 
    {
        return countries.add(country);
    }   
}
