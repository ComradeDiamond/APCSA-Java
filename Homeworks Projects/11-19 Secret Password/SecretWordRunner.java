class SecretWordRunner {
  public static void main(String[] args) {
   //Construct three SecretWord objects and show how newWord(int num) works
   SecretWord one = new SecretWord("hello");
   SecretWord two = new SecretWord("peekaboo");
   SecretWord three = new SecretWord("las is trash");

   System.out.println(one.newWord(2));
   System.out.println(two.newWord(2));
   System.out.println(three.newWord(5));
  }
}