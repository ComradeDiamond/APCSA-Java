public class BankAccountRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to the Henry Stickmin Bank: The only bank that scams the heck out of you");
    System.out.println("===============");

    //Create four accounts 
    BankAccount a1 = new BankAccount("Justin", 0, "turkeybaconeggandcheese");
    BankAccount a2 = new BankAccount("Steven", 13.4, "meow");
    BankAccount a3 = new BankAccount("Philip", 23.4, "felipe");
    BankAccount a4 = new BankAccount("Taco Cat", 34234.34, "ImAPalindrome");

    //print out the account info for each customer
    a1.printAccountInfo();
    a2.printAccountInfo();
    a3.printAccountInfo();
    a4.printAccountInfo();
    System.out.println("===============");
        
    //add to the balance of two of the customers
    a1.deposit(334.45, "turkeybaconeggandcheese");
    a2.deposit(4234.4, "meow");
    
    //check their new balance
    a1.bal();
    a2.bal();
    System.out.println("===============");
    
    //withdraw money from two of the accounts
    a3.withdrawal(4.3, "felipe");
    a4.withdrawal(23.4, "ImAPalindome");
    
    //check the new balance
    a3.bal();
    a4.bal();
    System.out.println("===============");
    
    //update the name to a customer and check the new name.
    a1.name = "ComradeDiamond";
    System.out.println(a1.name); 
    System.out.println("==============="); 
    
    //test out the toString() method
    System.out.println(a1.toString());
    System.out.println(a2.toString());
    System.out.println(a3.toString());
    System.out.println(a4.toString());
  
  }
}
