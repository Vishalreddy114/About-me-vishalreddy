public class Dog
{
   //################## instance variables ##################
   
   private String name;
   private String breed;
   private int age;

   //#################### constructor(s) ####################

   public Dog( String nameIn, String breedIn, int ageIn )
   {
      name = nameIn;
      breed = breedIn;
      age = ageIn;
   }

   //###################  other methods #####################

   public int getAge()
   {
      return age;  
   }
   
   public void setAge( int ageIn )
   {
      age = ageIn;  
   }
   
   public void incrementAge()
   {
      ++age;  
   }
    
}  //======= end class Dog =======

