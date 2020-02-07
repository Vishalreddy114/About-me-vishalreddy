public class BankAccount
{
   //################## instance variables ##################
   private String ownerName;
   private String ownerNumber;
   private double balance;

   //#################### constructor(s) ####################
   public BankAccount()
   {
       ownerName = "";
       ownerNumber = "";
       balance = 0.0;
   }

   public BankAccount(String ownerName, String ownerNumber, 
                      double balance)
   {
      this.ownerName = ownerName;
      this.ownerNumber = ownerNumber;
      this.balance = balance;
   }

   public void setOwnerName (String ownerNameIn)
   {
       ownerName = ownerNameIn;
   }
  
   public void setOwnerNumber (String ownerNumber)
   {
       this.ownerNumber = ownerNumber;
   }
   
   public void setAccountBalance(double balanceIn)
   {
       balance = balanceIn;
   }
   
   public double getBalance()
   {
       return balance;
   }
  
   public void deposit(double deposit)
   {
       balance = balance + deposit;
   }
   
   public void withdrawal(double withdraw)
   {
       balance = balance - withdraw;
   }
   
}  //======= end class BankAccount =======
