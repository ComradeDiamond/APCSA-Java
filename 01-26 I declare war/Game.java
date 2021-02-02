import java.util.Scanner;
import java.util.ArrayList;

/**
 * Represents the game class! This is basically the game you play.
 * @author Blackjack Boys
 * @since 1/28/21
 */
public class Game {
  /**
   * The player
   */
  private Player player;
  /**
   * The bot you're playing against
   */
  private Player bot;
  /**
   * The scanner we'll use to parse input
   */
  private Scanner scanner;
  /**
   * Whether the player has won
   */
  private boolean win;

  /**
   * Constructs a game object.
   * Postcondition: this.scanner is a System.in scannr
   * Postcondition: The player and the bot recieves half the pooledDeck
   * Postcondition: Shuffles the player and bot hand
   * Postcondition: Sets this.win to false
   */
  public Game() {
    this.scanner = new Scanner(System.in);

    Deck pooledDeck = new Deck();
    this.player = new Player(pooledDeck);
    this.bot = new Player(pooledDeck);

    this.player.shuffle();
    this.bot.shuffle();
    
    this.win = false;
  }

  /**
   * Stimulates a round of the game.
   * If the player's handSize is 0, the computer wins
   * If the computer's handSize is 0, the player wins
   * If noone won the game, stimulate a battle round via this.fight();
   * If someone won the game, stop the game.
   * If noone won the game, call play() again
   */
  public void play()
  {
    if (this.player.handSize() == 0)
    {
      System.out.println("The computer wins!");
      this.win = true;
    }
    else if (this.bot.handSize() == 0)
    {
      System.out.println("The player wins!");
      this.win = true;
    }

    if (!win)
    {
      //Asks for user input
      System.out.print("Press 'ENTER' to fight another battle or type 'S' to shuffle your deck! ");
      String input = this.scanner.nextLine();

      if (input.equalsIgnoreCase("s"))
      {
        this.player.shuffle();
      }
      else
      {
        this.fight(1);
      }

      this.play();
    }
    else
    {
      System.out.println("---Game End---");
    }
  }

  /**
   * Stimualates a card "fight".
   * Precondition: Both the player deck and bot deck's size >= 0
   * Postcondition: The player that has the higher card value will get everything played during the fight rounds
   * Postcondition: If there is a tie, call fight(4) to stimulate I declare war
   * @param numRounds The number of cards a player will put down (since 1 card = 1 round in war)
   */
  public void fight(int numRounds) {
    Card temp0 = new Card("ZERO", "NULL", 0);
    ArrayList<Card> playerPlays;
    ArrayList<Card> botPlays;

    playerPlays = this.player.play(numRounds);
    botPlays = this.bot.play(numRounds);

    Card playerCard = playerPlays.size() == 0 ? temp0 : playerPlays.get(playerPlays.size() - 1);
    Card botCard = botPlays.size() == 0 ? temp0 : botPlays.get(botPlays.size() - 1);

    if (playerCard.getValue() == botCard.getValue())
    {
      System.out.println("You played a " + playerCard.toString() + " and the bot played a  " + botCard.toString()+ ".");
      System.out.println("It's a tie! Battle Again! You and the computer each lay down 3 cards and battle with the 4th card.");

      this.fight(4);
    }
    else
    {
      System.out.println("You played a " + playerCard.toString() + " and the bot played a  " + botCard.toString()+ ".");

      Player playerWon = playerCard.getValue() > botCard.getValue() ? this.player : this.bot;

      String wonName = playerWon == this.player ? "You" : "The computer";

      System.out.println(wonName + " won! They recieve all the cards in the war pile");
      playerWon.siphonWinCards(playerPlays);
      playerWon.siphonWinCards(botPlays);
    }
  }
}