import java.util.Arrays;

/**
 * A class for representing a generic board Originally used for tic-tac-toe, but
 * hoping to expand to other games
 */
public class Board {
    /**
     * Keeping track of all the values on the current board.
     */
    private String[][] boardArr;
    /**
     * The width of the board.
     */
    private int width;
    /**
     * The height of the board.
     */

    private int height;

    /**
     * Alocate all the spaces and dimensions for the game.
     * @precondition width >= 1, height >= 1
     * @postcondition Creates a board with width width and height height. Initializes all to -
     * @param width  the width of the game board
     * @param height the height of the game board
     */
    public Board(int width, int height) {
        this.boardArr = new String[height][width];

        for (int r = 0; r < boardArr.length; r++)
        {
            for (int c = 0; c < boardArr[r].length; c++)
            {
                boardArr[r][c] = "-";
            }
        }

        this.width = width;
        this.height = height;
    }

    /**
     * Construct using 2d String array
     * @precondition b must have a minimum size of 1x1
     * @postcondition sets width and height to the width and height of b
     * @param b The 2D array to turn into the tic tac toe board
     */
    public Board(String[][] b) {
        this.boardArr = b;
        this.height = b.length;
        this.width = b[0].length;
    }

    /**
     * Standard mutator or setter
     * 
     * @param row the row value to be set
     * @param col the col value to be set
     * @param val the String that is setting "X","O" or "-""
     */
    public void set(int row, int col, String val) {
        this.boardArr[row][col] = val;
    }

    /**
     * Standard accessor or getter
     * 
     * @param row the row starting at index 0
     * @param col the column starting at index 0
     * @return String "X" or "O"
     */
    public String get(int row, int col) {
        return this.boardArr[row][col];
    }

    /**
     * Accessor method for this.width;
     * @return int the width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Accessor method for this.height;
     * @return int the height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Easy way to look at the data
     * @return String the location of the "X","O" and "-" for the game
     */
    public String toString() {
        String toOut = "";

        for (String[] row : this.boardArr)
        {
            toOut += Arrays.toString(row) + "\n";
        }

        return toOut;
    }
}