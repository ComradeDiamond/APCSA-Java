public class Timer 
{
    private int hrs;
    private int mins;
    private int secs;

    //initialize everything to zero
    public Timer() 
    {
        hrs = 0;
        mins = 0;
        secs = 0;
    }

    //initialzie to h, m and s
    public Timer(int h, int m, int s) 
    {
        hrs = h;
        mins = m;
        secs = s;
    }

    //reset time
    public void reset(int h, int m, int s) 
    {
        hrs = h;
        mins = m;
        secs = s;
    }

    //Advances time by 1 second - Tricky!  Let me know if you need a hint!
    public void increment() 
    {
        secs++;

        if (secs == 60)
        {
            secs = 0;
            mins++;

            if (mins == 60)
            {
                mins = 0;
                hrs++;
            }
        }
    }

    //VSC autofill saves lives XD
    public String exportTime()
    {
        return hrs + ":" + mins + ":" + secs;
    }
}