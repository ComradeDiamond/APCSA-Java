/**
 * The superclass for all players. 
 * This is going to be tossed in to TicTacToe.java for everything polymorphism.
 * @author Justin
 * @since 3/11/21
 */
public class Player {
    /**
     * The current tictactoe board we'll be using.
     */
    private TicTacToe t;

    /**
     * COnstructs a player object.
     * @param t The current tictactoe board reference
     */
    public Player(TicTacToe t)
    {
        this.t = t;
    }

    /**
     * Makes a move on the tic tac toe board
     */
    public void makeMove()
    {
        System.out.println("Justin what are you doing smh");
    }

    /**
     * Accessor method for this.t
     * @return this.t
     */
    public TicTacToe getT()
    {
        return this.t;
    }
}
