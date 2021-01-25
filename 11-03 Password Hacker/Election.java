public class Election
{
  public static void hack(String login, int digits)
  {
    int maxNum = 0;
    String digitStr = "%0" + digits + "d";
    for (int i=0; i<digits; i++)
    {
      maxNum += (9 * Math.pow(10,i));
    }

    String password = "";
    for (int i=0; i<=maxNum; i++)
    {
      password = String.format(digitStr, i);
      if (LoginsAndPasswords.correctIdAndPassword(login, password))
      {
        System.out.println("Password for " + login + " is " + password + "!");
        break;
      }
    }
  }
}