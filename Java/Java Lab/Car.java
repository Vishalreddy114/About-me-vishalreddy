/**
 * This class models a Car 
 * 
 * @author  Carol Spradling
 * @date    February, 2006
 */
public class Car
{  
    //============= instance variables ================    
    private String  make; 
    private  int mileage;
    private double price;         

    //============= constructor ========================    
    
    //Constructor with no parameters which sets the instance variable
    //to default values of an empty string, 0 or 0.0
    public Car()
    {
        make = "";
        mileage = 0;
        price = 0.0;
    }
    
    // Constructor that instantiates a new Car object with parameters of 
    //yearIn, makeIn, modelIn, mileageIn, priceIn
     public Car(String makeIn, int mileageIn, double priceIn)
    {
        make = makeIn; 
        mileage = mileageIn;
        price = priceIn;  
    } 
    
    //============= methods ========================        

    //Sets the instance variable make
    public void setMake( String makeIn )
    {
        make = makeIn;
    }
    
    //Sets the instance variable mileage
    public void setMileage( int mileageIn )
    {
        mileage = mileageIn;
    }
    
    //Sets the instance variable price
    public void setPrice( double priceIn )
    {
        price = priceIn;
    }
    
    //Returns the instance variable price
    public double getPrice()
    {
        return price;
    }
    
    // Rolls back the mile by subtracting a roll back amount. 
    public void rollBackMiles( int rollBackAmount)
    { 
        //The user enters in the amount to roll back the odometer
        mileage = mileage - rollBackAmount;       
    } 


    //Returns all instance variables in a prescribed format
    public String toString()
    {
        return "Crazy Larry's Used Cars" +
                "\nMake:\t" + make
                + "\nMiles:\t" + mileage + "\nPrice:\t" + price; 
    }   
}   //======= end of class Car =======

