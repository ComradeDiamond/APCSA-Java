public class FrogStimulation
{
    private int goalDistance;
    private int maxHops;

    public FrogStimulation(int dist, int numHops)
    {
        this.goalDistance = dist;
        this.maxHops = maxHops;
    }

    public boolean simulate()
    {
        int distance = 0;

        for (int i=0; i<this.maxHops; i++) //Iterates maxHops times
        {
            distance += this.hopDistance();

            //Stops the whole code and terminates when distance becomes negative
            if (distance < 0)
            {
                return false;
            }
        }

        return (distance >= this.goalDistance);
    }

    public double runSimulation(int num)
    {
        int numSuccess = 0;

        for (int i=0; i<num; i++)
        {
            //If simulate is good, add 1 to numSuccess
            numSuccess += this.simulate() ? 1 : 0;
        }

        double result = (double) numSuccess / (double) num;
        return result;
    }
}