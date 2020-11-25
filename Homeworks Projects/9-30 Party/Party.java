public class Party
{
    private boolean partyStarted;
    private boolean discoLightsOn;
    private int numberOfPeople;

    Party()
    {
        partyStarted = false;
        discoLightsOn = false;
    }

    Party(boolean pS)
    {
        this();
        partyStarted = pS;
    }

    Party(boolean pS, boolean dL, int nP)
    {
        this();
        partyStarted = pS;
        discoLightsOn = dL;
        numberOfPeople = nP;
    }

    //o.o floppy disk time
    public void partyStart()
    {
        if (partyStarted)
        {
            System.out.println("Bruh the party is on");
        }
        else
        {
           partyStarted = true;
        }
    }

    public void partyStop()
    {
        if (partyStarted)
        {
            partyStarted = false;
        }
        else
        {
            System.out.println("Bruh the party is off");
        }
    }

    public void lightsOn()
    {
        if (discoLightsOn)
        {
            System.out.println("Bruh disco lights are on");
        }
        else
        {
            discoLightsOn = true;
        }
    }

    public void lightsOff()
    {
        if (discoLightsOn)
        {
            discoLightsOn = false;
        }
        else
        {
            System.out.println("Bruh the lights are off");
        }
    }

    public void addPeople()
    {
        numberOfPeople++;
    }

    public void printStatus()
    {
        System.out.println("Party Started: "+partyStarted);
        System.out.println("Disco Lights On: "+discoLightsOn);
        System.out.println("Number of Guests: "+numberOfPeople);
    }

    public String toString()
    {
        String returnstring = "{partyStarted:" + partyStarted +",discoLightsOn:" + discoLightsOn +
        ",numberOfPeople:" + numberOfPeople + "}";

        return returnstring;
    }
}