// Implements the game of Craps logic

public class CrapsGame {
    private int point = 0;

    /**
     *  Calculates the result of the next dice roll in the Craps game.
     *  The parameter total is the sum of dots on two dice.
     *  point is set to the saved total, if the game continues,
     *  or 0, if the game has ended.
     *  Returns 1 if player won, -1 if player lost,
     *  0 if player continues rolling.
     */
    public int processRoll(int total) {
        int result = 0;

        if (this.point == 0)
        {   
            switch(total)
            {
                case 7:
                case 11:
                    result = 1;
                break;

                case 2:
                case 3: 
                case 12:
                    result = -1;
                break;
            }
        }
        else
        {
            if (total == 7)
            {
                result = -1;
            }
            else if (total == this.point)
            {
                result = 1;
            }
        }

        this.point = (result == 1 || result == -1) ? 0:total;
        return result;
    }

    /**
     *  Returns the saved point
     */
    public int getPoint() {
        return point;
    }
}
