//Activity 10
public class gas
{
    public static void main(String[] args)
    {
        double gallonPrice = 2.35;
        double milesPerGallon = 40;
        double totalFunds = 8.0;
        double numGallons = totalFunds / gallonPrice;
        double numMiles = numGallons * milesPerGallon;
        System.out.println(numMiles);
    }
}