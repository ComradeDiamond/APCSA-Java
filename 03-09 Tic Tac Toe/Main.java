public class Main {

    public static void main(String[] args) {
        //human();
        //dumbBot();
        //dumberBot();
        //smartBot();
        maybeDumbBot();
    }

    /**
     * Extra Credit: Try to make an AIPlayer. 
     * AI player is called SmartPlayer btw for consistency purposes.
     */
    public static void smartBot() {
        TicTacToe game = new TicTacToe();
        Player p1 = new HumanPlayer(game);
        Player p2 = new AIPlayer(game);
        playGame(p1, p2, game);
    }

    /**
     * AIPlayer plays against randomPlayer
     */
    public static void maybeDumbBot() {
        TicTacToe game = new TicTacToe();
        Player p1 = new RandomPlayer(game);
        Player p2 = new AIPlayer(game);
        playGame(p1, p2, game);
    }

    /**
     * If you get that, then have RandomPlayer vs HumanPlayer.
     */
    public static void dumbBot() {
        TicTacToe game = new TicTacToe();
        Player p1 = new HumanPlayer(game);
        Player p2 = new RandomPlayer(game);
        playGame(p1, p2, game);
    }

    /**
     * Then try random vs random.
     */
    public static void dumberBot() {
        TicTacToe game = new TicTacToe();
        Player p1 = new RandomPlayer(game);
        Player p2 = new RandomPlayer(game);
        playGame(p1, p2, game);
    }

    /**
     * First Goal: create a TicTacToe object (t0?) create two HumanPlayer objects
     * (player1 and player2?) and have two players play each-other using Scanner for
     * input You will use getPlayer(), makeMove(), switchPlayer() and winner() Play
     * until there is a winner or a tie. Announce the winner or the tie.
     */
    public static void human() {
        TicTacToe game = new TicTacToe();
        Player p1 = new HumanPlayer(game);
        Player p2 = new HumanPlayer(game);
        playGame(p1, p2, game);
    }

    /**
     * Starts and plays a game of TicTacToe until someone wins.
     * @param p1 Player1
     * @param p2 Player2
     * @param game The game you're starting (or continuing)
     */
    public static void playGame(Player p1, Player p2, TicTacToe game) {
        String winner = ""; //Keeps track of results from getWinner
        boolean toggle = true; //This boolean toggles whose turn it is

        System.out.println(game);
        while (winner == "")
        {
            if (toggle)
            {
                System.out.println("----\nPlayer 1's turn:");
                p1.makeMove();
            }
            else
            {
                System.out.println("----\nPlayer 2's turn:");
                p2.makeMove();
            }
            
            //Increment game tack
            game.tackPlusPlus();

            //Prepares for next turn
            toggle = !toggle;
            game.switchPlayer();
            System.out.println(game);
            winner = game.winner();
        }

        System.out.println("WINNER: " + winner);
    }
}