public class Main {
    public static void main(String[] args) {
      Ticket t1 = new StudentAdvance(33);
      Ticket t2 = new Advance(8);
      Ticket t3 = new Walkup();
      Ticket t4 = new StudentAdvance(5);
      Ticket t5 = new Advance(18);
  
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(t3);
      System.out.println(t4);
      System.out.println(t5);
    }
  }