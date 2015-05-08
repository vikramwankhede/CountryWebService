package client;

public class Museum 
{
    String productID;
    String productName;
    String dateCreated;
    String museumPlace;
    boolean isDamaged;

    public Museum() 
    {
        super();
    }
    
    public Museum(String ID, String Name, String date, String place, boolean damaged) 
    {
        this.productID = ID;
        this.productName = Name;
        this.dateCreated = date;
        this.museumPlace = place;
        this.isDamaged = damaged;
    }
    
    public void setDateCreated(String dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public String getDateCreated() 
    {
        return dateCreated;
    }

    public void setMuseumPlace(String museumPlace) 
    {
        this.museumPlace = museumPlace;
    }

    public String getMuseumPlace() 
    {
        return museumPlace;
    }

    public void setIsDamaged(boolean isDamaged) 
    {
        this.isDamaged = isDamaged;
    }

    public boolean isIsDamaged() 
    {
        return isDamaged;
    }
    
    public void setProductID(String productID) 
    {
        this.productID = productID;
    }

    public String getProductID() 
    {
        return productID;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    
}
