/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerPackage;

/**
 *
 * @author c_sprad
 */
import java.util.Scanner;

public class ScannerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myString;
        int intNumber;
        double doubleNumber;

        Scanner keyboardInput = new Scanner(System.in);

        System.out.print( "Enter an integer: " );
        intNumber = keyboardInput.nextInt();

        System.out.print( "Enter a double: " );
        doubleNumber = keyboardInput.nextDouble();
        keyboardInput.nextLine();

        System.out.print( "Enter a string: " );
        myString = keyboardInput.nextLine();

        System.out.println("This is the int number " + intNumber);
        System.out.println("This is the double number " + doubleNumber);
        System.out.println("This is the string " + myString );
        
    }
    
}
