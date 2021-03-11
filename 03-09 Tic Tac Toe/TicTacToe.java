/**
 * A class for managing all the rules of TicTacToe and keeping track of the
 * current player, who, the number of 'moves,' who is the winner and clearing
 * the board when it's time to switch players.
 */
public class TicTacToe {
    /**
     * A 3x3 board for tic tac toe Note: it's a board of type String Something new for
     * us.
     */
    private Board board;

    /**
     * player can be the character "X" or "O" starts as an "X" and gets swapped
     */
    private String player;

    /**
     * Keeps track of the number of times both players have played on the board. 
     * Basically keeps track of turns. 
     * If numTacks == 9, there's no more valid board space and the game ends.
     */
    private int numTacks;

    /**
     * This Constructor is more for testing.
     * @param b The Board object keeps track of the "X" and "O" placement and the
     *          dimensions of the board.
     * @precondition Board size must be 3x3
     */
    public TicTacToe(Board b) {
        this.board = b;
        this.player = "X";
        this.numTacks = 0;
    }

    /**
     * Default Constructor sets all spots to "-".
     * @postcondiiton Sets this.board to a new 3x3 board
     */
    public TicTacToe() {
        this.board = new Board(3, 3);
        this.player = "X";
        this.numTacks = 0;
    }

    /**
     * Resets the board to start over when it's time start a new game.
     * @postcondition this.board references a completely new board.
     * @postcondition this.numTacks is reset to 0
     */
    public void clearBoard() {
        this.board = new Board(3, 3);
        this.numTacks = 0;
    }

    /**
     * @postcondition Increments this.numTacks.
     */
    public void tackPlusPlus() {
        this.numTacks++;
    }

    /**
     * Checks for a winner. If a winner exists, it returns the String of that winner.
     * Avoid calling this unnecessarily, as it takes a while. 
     * @return The winning player, as a String. Returns empty String is there's no winner. Returns "TIE" if it's a tie.
     */
    public String winner() {

        Marker[] markRow = rowResult("X");
        Marker[] markCol = columnResult("X");
        Marker[] markDiag = diagResult("X");

        Marker[] rowMark = rowResult("O");
        Marker[] colMark = columnResult("O");
        Marker[] diagMark = diagResult("O");

        //Loops through markRow and markcol to check for 3 numOccurs.
        for (int i = 0; i < 3; i++)
        {
            if (markRow[i].numOccur == 3 || markCol[i].numOccur == 3)
            {
                return "X"; //Ye if we find it, get out asap
            }

            if (rowMark[i].numOccur == 3 || colMark[i].numOccur == 3)
            {
                return "O";
            }
        }

        //Handles diagonal
        for (int i = 0; i < 2; i++)
        {
            if (markDiag[i].numOccur == 3)
            {
                return "X";
            }

            if (diagMark[i].numOccur == 3)
            {
                return "O";
            }
        }

        //If no result by turn 9, it's a tie
        if (this.numTacks == 9)
        {
            return "TIE";
        }

        return "";
    }

    /**
     * Returns a general sense of each row board. 
     * It's more for the AI later than for the player. 
     * This seems scary, but everything is really just done in constant time.
     * @param Player "X" or "O" to search for.
     * @return An array of markers for the rows for the player given.
     */
    public Marker[] rowResult(String player) {
        Marker[] markRow = new Marker[3];
        
        //This uses getWidth and getHeight, but in TicTacToe it should only be 3x3
        for (int r = 0; r < this.board.getHeight(); r++)
        {
            int numOccur = 0;
            int[] idxMissing = new int[2];
            boolean occupied = false;

            for (int c = 0; c < this.board.getWidth(); c++)
            {
                if (this.board.get(r, c).equals(player))
                {
                    numOccur++;
                }
                else
                {
                    idxMissing[0] = r;
                    idxMissing[1] = c;

                    //This means it's the opponent
                    if (!this.board.get(r, c).equals("-"))
                    {
                        occupied = true;
                    }
                }
            }

            if (numOccur < 1)
                {
                    idxMissing[0] = -1;
                    idxMissing[1] = -1;
                }
    
            markRow[r] = new Marker(numOccur, idxMissing, occupied);
        }

        return markRow;
    }

    /**
     * Returns a general sense of each column board. 
     * It's more for the AI than the player. 
     * @param Player "X" or "O" to search for
     * @return An array of markers for the for the player given.
     */
    public Marker[] columnResult(String player) {
        Marker[] markCol = new Marker[3];
        
        for (int c = 0; c < this.board.getWidth(); c++)
        {
            int numOccur = 0;
            int[] idxMissing = new int[2];
            boolean occupied = false;

            for (int r = 0; r < this.board.getHeight(); r++)
            {
                if (this.board.get(r, c).equals(player))
                {
                    numOccur++;
                }
                else
                {
                    idxMissing[0] = r;
                    idxMissing[1] = c;

                    //This means it's the opponent
                    if (!this.board.get(r, c).equals("-"))
                    {
                        occupied = true;
                    }
                }
            }

            if (numOccur < 1)
            {
                idxMissing[0] = -1;
                idxMissing[1] = -1;
            }
    
            markCol[c] = new Marker(numOccur, idxMissing, occupied);
        }

        return markCol;
    }

    //Take care of diagnoals
    public Marker[] diagResult(String player)
    {
        Marker[] markerDiag = new Marker[2];

        int numOccur = 0;
        int[] idxMissing = new int[2];
        boolean occupied = false;

        // y = -x
        for (int r = 0; r < this.board.getHeight(); r++)
        {
            if (this.board.get(r, r).equals(player))
            {
                numOccur++;
            }
            else
            {
                idxMissing[0] = r;
                idxMissing[1] = r;

                if (!this.board.get(r, r).equals("-"))
                {
                    occupied = true;
                }
            }
        }
        
        if (numOccur < 1)
        {
            idxMissing[0] = -1;
            idxMissing[1] = -1;
        }
    
        markerDiag[0] = new Marker(numOccur, idxMissing, occupied);
        numOccur = 0;
        idxMissing = new int[2];
        occupied = false;

        //y = x
        for (int r = 0; r < board.getHeight(); r++)
        {
            int c = 2 - r;

            if (this.board.get(r, c).equals(player))
            {
                numOccur++;
            }
            else
            {
                idxMissing[0] = r;
                idxMissing[1] = c;

                if (!this.board.get(r, c).equals("-"))
                {
                    occupied = true;
                }
            }
        }

        if (numOccur < 1)
        {
            idxMissing[0] = -1;
            idxMissing[1] = -1;
        }
    
        markerDiag[1] = new Marker(numOccur, idxMissing, occupied);

        return markerDiag;
    }

    /**
     * Accessor method for this.board.
     * @return this.board
     */
    public Board getBoard() {
        return this.board;
    }

    /**
     * Accessor method for this.player.
     * @return this.player
     */
    public String getPlayer() {
        return this.player;
    }

    /**
     * Swaps between "X" and "O".
     * @postcondition If "X", set x. If "O", set o.
     */
    public void switchPlayer() {
        if (this.player.equals("X"))
        {
            this.player = "O";
        }
        else
        {
            this.player = "X";
        }
    }

    /**
     * Returns the TicTacToe game display as a string.
     * @return this.board.toString();
     */
    public String toString() {
        return this.board.toString();
    }
}