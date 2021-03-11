/**
 * The smart AI player that will actually make an attempt at winning! 
 * This is the extra credit class.
 * @author Justin
 * @since 3/11/21
 */
public class AIPlayer extends Player {

    /**
     * The points that the AI will prioritize. 
     * The more forward the point is, the higher "queue" or rank the point has.
     */
    private static int[][] prioritizedPoints = {
        {1, 1}, {0, 0}, {0, 2}, {2, 0}, {2, 2}, {0, 1}, {1, 0}, {1, 2}, {2, 1}
    };

    /**
     * Constructs a smart player.
     * @param t The tic-tac-toe board that is the game
     */
    public AIPlayer(TicTacToe t) {
        super(t);
    }

    /**
     * The AI makes a move. 
     * @postcondition The tictactoe board is modified.
     */
    public void makeMove() {
        int[] move = determineMove();

        this.getT().getBoard().set(move[0], move[1], this.getT().getPlayer());
    }

    /**
     * Determines which point the AI will move towards. 
     * The AI has a set of coordinate points that it will prioritize using a 2D array. 
     * First if there is a way to win, clinch it. 
     * If the opponent is about to win, don't let them win. 
     * If none of those are true, then we get the AI to play in a spot that will advance a victory in an unoccupied spot. 
     * Finally if both of these are false, we have the AI play in the prioritized points.
     * @return An int[], with int[0] == x coordinate and int[1] == y coordinate
     */
    private int[] determineMove() {

        //Keeps track of the index we must place it at to clinch or stop a win
        int[] threatEnemy = null;
        int[] threatFriendly = null;
        int[] quack = null; //The coord to play if we have 1 unblocked

        //Gets the result of X and O columns
        Marker[] markRow = this.getT().rowResult("X");
        Marker[] markCol = this.getT().columnResult("X");
        Marker[] markDiag = this.getT().diagResult("X");

        Marker[] rowMark = this.getT().rowResult("O");
        Marker[] colMark = this.getT().columnResult("O");
        Marker[] diagMark = this.getT().diagResult("O");

        //Keeps track of all the marker arrays.
        Marker[][] markerGrid = {markRow, markCol, rowMark, colMark, markDiag, diagMark};
        //The marker parallel keeps track of the X and Os for the markerGrid
        String[] markerParallel = {"X", "X", "O", "O", "X", "O"};

        //This for loops is column major
        for (int i = 0; i < 3; i++)
        {
            //Grid loop control ensures that only markDiag and diagMark's first two columns will be examined
            //Prevents outofbounds exception
            int gridLoopControl = i < 2 ? markerGrid.length : markerGrid.length - 2;
            for (int c = 0; c < gridLoopControl; c++)
            {
                Marker marker = markerGrid[c][i];

                //isFriendly determines whether or not the current markerArray is referring to the AI
                boolean isFriendly = this.getT().getPlayer().equals(markerParallel[c]);

                //Handles occupied
                if (marker.occcupied) continue;

                if (marker.numOccur == 2)
                {
                    if (isFriendly)
                    {
                        threatFriendly = marker.idxMissing;
                    }
                    else
                    {
                        threatEnemy = marker.idxMissing;
                    }
                }
                else if (marker.numOccur == 1 && isFriendly)
                {
                    quack = marker.idxMissing;
                }
            }
        }

        //Clinch or stop win
        if (threatFriendly != null)
        {
            return threatFriendly;
        }

        if (threatEnemy != null)
        {
            return threatEnemy;
        }

        //Plop interest points
        if (quack != null)
        {
            return quack;
        }

        //Plops the prioritized points if there's no interest points left
        for (int i = 0; i < AIPlayer.prioritizedPoints.length; i++)
        {
            int x = AIPlayer.prioritizedPoints[i][0];
            int y = AIPlayer.prioritizedPoints[i][1];

            if (this.getT().getBoard().get(x, y) == "-")
            {
                return new int[] {x, y};
            }
        }

        return new int[] {0, 0}; //If code reaches here, we have a bug because this is theoretically impossible to reach.
    }
}
