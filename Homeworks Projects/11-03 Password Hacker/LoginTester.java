/**
   The file LoginsAndPasswords.class contains some fake logins and passwords/
   Here are three you can know for testing purposes:
   demologin0 has password 987654
   demologin6 has password 000123
   demologin8 has password 00000123
   
   You are tasked with finding the passwords for login1, login2, login3 and login4
   login1 and login2 have six digit integer logins.
   login3 and login4 have eight digit integer logins.

   You can write a loop (or 2) to help you find the passwords.

   There is a static method in LoginsAndPasswords you will use to check your guesses.
   Here is the signature: 
   public static boolean correctIdAndPassword(String name, String passwd)
   
   There is a little code below to help you see how the method works.
   There are also a few examples of String.format() to help you deal with leading zeros.
*/
class Main {
    public static void main(String[] args)
    {
  
      Election.hack("login1", 6); //432987
      Election.hack("login2", 6); //123456
      Election.hack("login3", 8); //3145927
      Election.hack("login4", 8); //76543210
    }
  }