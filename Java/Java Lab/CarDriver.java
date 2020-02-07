//============ import packages =================
import java.util.Scanner; 

public class CarDriver
{ 
    public static void main(String [] args) 
    {
        //declare variables
        String make;
        int mileage, rollBackMiles;
        double price, totalPrices; 
        
        //Instantiate scanner object named keyboardInput to 
        //read input from a keyboard
        Scanner keyboardInput = new Scanner( System.in );
        
        //Prompt for and input make
        System.out.print( "Enter the make: ");
        make = keyboardInput.next();
        
        //Prompt for and input mileage
        System.out.print( "Enter the mileage: " );
        mileage = keyboardInput.nextInt();
        
        //Prompt for and input price
        System.out.print( "Enter the price: " );
        price = keyboardInput.nextDouble();
        
        //Instantiate Car object using variables input from keyboard
        Car car1 =  new Car(make, mileage, price);
        
        //Prompt for and input rollback amount
        System.out.print( "Enter the amount of mileage to rollback: " );
        rollBackMiles = keyboardInput.nextInt();
        
        //Call rollBackMileage method to modify mileage for car1
        car1.rollBackMiles(rollBackMiles);
        
        //Print out sticker information using toString() method
        System.out.println();
        System.out.println( car1.toString() );
        System.out.println();
        
        //Instantiate car2 object with no parameters
        Car car2 = new Car();

        //Prompt for and input make
        System.out.print( "Enter the make: ");
        make = keyboardInput.next();
        
        //Call method to set Make for car2
        car2.setMake( make );
        
        //Prompt for and input mileage
        System.out.print( "Enter the mileage: " );
        mileage = keyboardInput.nextInt();
        
        //Call method to set mileage for car2
        car2.setMileage( mileage );
        
        //Prompt for and input price
        System.out.print( "Enter the price: " );
        price = keyboardInput.nextDouble();
        
        //Call method to set price for car2
        car2.setPrice( price );

        //Print out sticker information using toString() method
        System.out.println();
        System.out.println( car2.toString() ); 
        System.out.println();
        
        //Get prices for car1 and car2 and store in totalPrices
        totalPrices = car1.getPrice() + car2.getPrice();
        
        //Print total prices for both cars
        System.out.println( "The total of all car prices is: " + totalPrices ); 
        
        }//=========================end of main========================
    

}   //======= end of class CarDriver =======
