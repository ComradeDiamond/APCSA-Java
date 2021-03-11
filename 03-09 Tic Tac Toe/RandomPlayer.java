/**
 * Denotes a random player. 
 * The AI of this player just randomly teleports to god knows where and makes a move lol.
 * @author Justin
 * @since 3/11/21
 */
public class RandomPlayer extends Player {

    /**
     * Constructs a random player.
     * @param t The tic-tac-toe board that is the game
     */
    public RandomPlayer(TicTacToe t) {
        super(t);
    }

    /**
     * The AI makes a random move. 
     * By that I mean it does some wacko RNG until we pray that it lands on something.
     * @postcondition The tictactoe board is modified.
     */
    public void makeMove() {
        int x = (int)(Math.random() * 3);
        int y = (int)(Math.random() * 3);

        while (!this.getT().getBoard().get(x, y).equals("-"))
        {
            x = (int)(Math.random() * 3);
            y = (int)(Math.random() * 3);
        }

        this.getT().getBoard().set(x, y, this.getT().getPlayer());
    }
}