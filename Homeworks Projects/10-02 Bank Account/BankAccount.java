public class BankAccount 
{
   public String name;
   private double balance;
   private String password;
   
   //Empty Constructor Sets password to null and balance to 0.0;
   public BankAccount()
   {
    name = null;
    balance = 0.0;
    password = "?";
   }

   //Two parameter constructor sets password and balance
   public BankAccount(String name, double bal, String pw)
   {
        this.name = name;
        balance = bal;
        password = pw;
   }
   
   //deposit adds money to the balance
   public void deposit(double depositAmount, String pw)
   {
       if (pw == password)
       {
            balance += depositAmount;
       }
       else
       {
           System.out.println("Password doesn't match");
       }
   }
   
   //withdrawal subtracts from the balance
   public void withdrawal(double depositAmount, String pw)
   { 
    if (pw == password)
    {
        balance -= depositAmount;
    }
    else
    {
        System.out.println("Password doesn't match");
    }
   }
   
   //print name and balance
   public void printAccountInfo()
   {
    System.out.println("Balance: " + balance);
    System.out.println("Name: " + name);
    System.out.println("Password: " + password);
    System.out.println("===============");
   }

   //print balance
   public void bal()
   {
       System.out.println("$" + balance);
   }
   
   //make a toString method instead
   public String toString()
   {
       return "{name:" + name + ",balance:" + balance + ",password:" + password + "}";
   }
 }
