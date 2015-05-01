package client;

public class Country 
{
    String countryID;
    String countryName;
    
    public Country() {
           super();
       }
    public Country(String id, String name) 
    {
        super();
        this.countryID = id;
        this.countryName = name;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
