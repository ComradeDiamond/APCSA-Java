public class TwoDie {
    Die die1;
    Die die2;

    TwoDie(Die die1, Die die2)
    {
        this.die1 = die1;
        this.die2 = die2;
    }

    public int roll()
    {
        return die1.roll() + die2.roll();
    }
}
