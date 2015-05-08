package client;

public class Country 
{
    String countryID;
    String countryName;
    
    // Default constructor
    public Country() {
           super();
       }
    
    // Parameterised constructor
    public Country(String id, String name) 
    {
        super();
        this.countryID = id;
        this.countryName = name;
    }
    
    // Setter method for countryID
    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    // Getter method for countryID
    public String getCountryID() {
        return countryID;
    }

    // Setter method for country name
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // Getter method of country name
    public String getCountryName() {
        return countryName;
    }
}
