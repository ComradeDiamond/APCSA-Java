public class Main {
   public static void main(String[] args)
   {
       Timer t1 = new Timer(2, 0, 0);
        t1.reset(0, 0, 0);
        System.out.println(t1.exportTime());

       Timer t2 = new Timer(4, 3, 2);
       Timer t3 = new Timer(4, 3, 2);

       for (int i=0; i<10; i++)
       {
        t1.increment();
        t2.increment();
        t3.increment();

        //System.out.println((t3.exportTime() == t2.exportTime()));
        System.out.println(t3.exportTime().equals(t2.exportTime()));
       }
   } 
}
