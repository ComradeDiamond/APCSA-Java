import java.util.Scanner;

/** 
 * class HumanPlayer manages the moves for making a move 
*/
public class HumanPlayer extends Player{

    /**
     * Constructs a human player for the tic tac toe game.
     * @param t The tic tac toe game
     */
    public HumanPlayer(TicTacToe t) {
        super(t);
    }

    /**
     * makeMove reads in two integers using Scanner and places a symbol.
     * If the spot is not open, it makes the player try again until he/she enters a correct move.
     * @precondition The user inserts two integers within the 3x3 range
     * @postcondition The board of this.t gets marked with a symbol X or O.
     */
    public void makeMove() 
    {
        Scanner leScan = new Scanner(System.in);
        boolean error = false;
        String errorMsg = "";

        int x = 0;
        int y = 0;

        try
        {
            //Error checks for numbers
            System.out.print("Please enter the x coordinate to mark a " + this.getT().getPlayer() + ": ");
            x = Integer.parseInt(leScan.nextLine());

            System.out.print("Please enter the y coordinate to mark a " + this.getT().getPlayer() + ": ");
            y = Integer.parseInt(leScan.nextLine());
        }
        catch(Exception err)
        {
            error = true;
            errorMsg = "insert a number you donut.";
        }

        //Error checks for in bounds
        if (x < 0 || x > 2 || y < 0 || y > 2)
        {
            error = true;
            errorMsg = "Please insert an x and y coordinate that is in bounds. x and y should be between 0 and 2.";
        }

        //Error checks for occupied
        if (!error && !this.getT().getBoard().get(x, y).equals("-"))
        {
            error = true;
            errorMsg = "The spot is occupied. Please pick another coordinate.";
        }

        if (error)
        {
            System.out.println("ERROR: " + errorMsg);
            this.makeMove();
        }
        else
        {
            this.getT().getBoard().set(x, y, this.getT().getPlayer());
        }
    }
}