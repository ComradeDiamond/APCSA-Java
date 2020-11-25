public class Die
{
    private int sides = 6;
    private int minVal = 1;
    private int numDots;

    public Die(){}

    public Die(int sides)
    {
        if (sides > 1)
        {
            this.sides = sides;
        }
        else
        {
            System.out.println("Value of sides in constructor must be > 1");
        }
    }

    public Die(int sides, int minVal)
    {
        if (sides > 2)
        {
            this.sides = sides;
            this.minVal = minVal;
        }
        else
        {
            System.out.println("Value of sides in constructor must be > 2");
        }
    }

    public void roll()
    {
        this.numDots = (int) (Math.random() * this.sides) + this.minVal;
    }

    public int getNumDots()
    {
        return this.numDots;
    }
}