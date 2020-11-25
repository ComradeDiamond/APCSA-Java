public class TwoDieRunner {
    public static void main(String[] args)
    {
        TwoDie tieDye = new TwoDie(new Die(), new Die());
        
        for (var i=0; i<50; i++)
        {
            System.out.println(tieDye.roll());
        }
    }
}
