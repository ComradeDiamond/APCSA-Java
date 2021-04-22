public class Println {
    public static void main(String[] args) {
      stringTraversal("Hello world!");
    }

    public static void stringTraversal(String s)
    {
        if (s.length() > 0)
        {
            System.out.print(s.substring(0, 1));
            stringTraversal(s.substring(1));
        }
    }
  }