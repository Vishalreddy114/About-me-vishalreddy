public class DogDriver
{
   public static void main( String[] args)
   {
      //============ local variables ============
      
      Dog dog1 = new Dog( "Zelda", "Standard Poodle", 7 );
      Dog dog2 = new Dog( "Sadie", "Jack Russell Terrier", 8 );
      
      //============= logic for main ============
      
      dog1.incrementAge();
      System.out.println( dog1.getAge() );
      
      dog2.setAge( 12 );
      System.out.println( dog2.getAge() );

   }  //===== end method main(String[]) =====  

}  //======= end class DogDriver =======

