package client;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Countries 
{
    List<Country> countries = new ArrayList<Country>();
    public Countries() 
    {
        super();
        
    }

    @WebMethod(exclude = true)
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

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
    
    public boolean addCountry(Country country) 
    {
        return countries.add(country);
    }

    
}
