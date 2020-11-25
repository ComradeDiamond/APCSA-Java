//Read two file java
import java.util.Arrays;
import java.util.Scanner; 
import java.io.File;

class Main {
  public static void main(String[] args) throws Exception {
    // Create a File instance for passwords
    java.io.File passwordFile = new File("password.txt");
    // Create a File instance for common passwords
    java.io.File topPasswordList = new File("topPasswordList.txt");


    // Create a Scanner for the passwordFile
    Scanner input = new Scanner(passwordFile);
   
    //Create passwordFile matrix - it would be easier with json but lmao
    String[][] pwdFileAr = new String[25][2];

    // Read data from a file
    int index = 0;
    while (input.hasNext()) {
      String password = input.next();
      pwdFileAr[index] = password.split(":");
      index++;
    }

    //Array.prototype.map(x => x[1])
    String[] pwdSoleAr = new String[25];

    for (int i=0; i<pwdFileAr.length; i++)
    {
        pwdSoleAr[i] = pwdFileAr[i][1];
    }
    
    // Close the file
    input.close();
    
    //Switch to the other file
    input = new Scanner(topPasswordList);
    // Read data from a file

    String[] topPasswordArr = new String[87];
    index = 0;
    while (input.hasNext()) {
      String password = input.next();
      String hashVal = MessageDigestMethod.messageDigestMD5(password);
      int idx = Arrays.asList(pwdSoleAr).indexOf(hashVal);

      if (idx != -1)
      {
        pwdFileAr[idx][1] = password;
      }
    }

    // Close the file
    input.close();

    //Return output finally

    for (int i=0; i<pwdFileAr.length; i++)
    {
        System.out.println(pwdFileAr[i][0] + ":" + pwdFileAr[i][1]);
    }

  }
}