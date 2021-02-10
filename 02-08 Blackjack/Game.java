import java.util.ArrayList;
import java.util.Scanner;

/**
 * The main game class that executes and plays the game!
 * @author BlackjackBoys
 */
public class Game {
    /**
     * The player deck
     */
    private ArrayList<Card> playerDeck;

    /**
     * The computer deck. Computer is used interchangeably with bot.
     */
    private ArrayList<Card> botDeck;

    /**
     * The main deck to draw from
     */
    private Deck deck;

    /**
     * Whether or not the game has ended
     */
    private boolean ended;

    /**
     * Constructor for the game class.
     * Postcondition: Initializes playerDeck, botDeck, deck, and ended attributes
     * Postcondition: If the player recieves 2 aces, convert an ace to 1
     * Postcondition: Gives the players both 2 decks in their hands to start off
     */
    public Game() {
        this.playerDeck = new ArrayList<Card>();
        this.botDeck = new ArrayList<Card>();
        this.deck = new Deck();
        this.ended = false;

        this.deck.shuffle();

        for (int i = 0; i < 2; i++) {

            // Check for aces on initial deal too so the player doesn't automatically lose
            // (A, A = 21 but it should be 12)
            this.checkAce(this.playerDeck);
            this.checkAce(this.botDeck);

            this.playerDeck.add(this.deck.deal());
            this.botDeck.add(this.deck.deal());
        }
    }

    /**
     * Stimulates the game/plays the game.
     * Precondition: this.ended == false;
     * Precondition: The player must type stand or hit
     * Postcondition: The player can hit or stand as long as this.ended == false
     * Postcondition: If the player busts, this.ended ends and the player stands
     */
    public void play() {
        Scanner leScan = new Scanner(System.in);

        while (!this.ended) {
            System.out.print("Your hand: ");
            System.out.println(this.playerDeck);
            System.out.println("Bot hand: " + this.botDeck.subList(0, 1));
            System.out.println("Would you like to hit or stand?");

            String action = leScan.nextLine();

            if (action.equalsIgnoreCase("stand")) {
                this.stand();
            } else if (action.equalsIgnoreCase("hit")) {
                this.hit(this.playerDeck, false);
            } else {
                System.out.println("Not a valid option!");
            }
        }

        leScan.close();
    }

    /**
     * Stimulates the player standing with the blackjack cards
     * Also makes for a good JoJo reference...
     * Postcondition: If the player or bot stands with less than 17 total card value, draw until they're sum is >= 17
     * Postcondition: Sets this.ended to true
     * Postcondition: Displays player and bot hand, and their total values. Use math to determine who won.
     * <b>As per blackjack rules, the bot is the dealer. If the player busts first, they lose.</b>
     * Postcondition: If the player and the bot both hit a blackjack, check for the ace of spades. The winner has the ace of spades.
     * Postcondition: In above edge case, if player and bot don't have ace of spades, it's a tie.
     */
    private void stand() {
        this.ended = true;
        int player = this.calculateTotal(this.playerDeck);
        int bot = this.calculateTotal(this.botDeck);

        // If the player has less than 17, they keep drawing cards until their hand
        // total is at least 17

        while (player < 17) {
            this.hit(this.playerDeck, true);

            player = this.calculateTotal(this.playerDeck);
        }

        while (bot < 17) {
            this.hit(this.botDeck, true);

            bot = this.calculateTotal(this.botDeck);
        }

        System.out.println();
        System.out.println("Your hand: " + this.playerDeck + " - Value: " + player);
        System.out.println("Computer hand: " + this.botDeck + " - Value: " + bot);

        if (player > 21) {
            System.out.println("You lose.");
        } else if (bot > 21) {
            System.out.println("You win!");
        } else if (player > bot) {
            System.out.println("You win!");
        } else if (bot > player) {
            System.out.println("The computer wins!");
        } else if (bot == player) {
            if (player == 21 && bot == 21 && this.playerDeck.size() == 2 && this.botDeck.size() == 2) {
                if (this.hasAceSpade(this.playerDeck)) {
                    // If player has spade ace + 10
                    System.out.println("You win!");
                } else if (this.hasAceSpade(this.botDeck)) {
                    // If bot has spade ace + 10
                    System.out.println("The computer wins!");
                } else {
                    // Neither of players have bigger ace, still a tie (push)
                    System.out.println("It's a tie.");
                }
            } else {
                System.out.println("It's a tie.");
            }
        }
    }

    /**
     * Private method that checks if a hand has ace of spades
     * @param hand this.playerDeck or this.botDeck
     * @return Whether or not the ace of spades is present in arrayList hand
     */
    private boolean hasAceSpade(ArrayList<Card> hand) {
        for (Card card : hand) {
            if (card.getRank().equals("A") && card.getRank().equals("♠")) {
                return true;
            }
        }

        return false;
    }

    /**
     * Stimulates a blackjack hit.
     * Precondition: The player or bot did not bust
     * Postcondition: The player or bot gets +1 card in their hand.
     * Postcondition: If they player hits the bust, the games forces it to stand.
     * @param hand The hand to hit in
     * @param isBot Whether or not the player hit/stand is automated. This is important in determining if we force stand if bust
     */
    private void hit(ArrayList<Card> hand, boolean isBot) {
        Card drawnCard = this.deck.deal();

        hand.add(drawnCard);
        this.checkAce(hand);

        if (this.lost(hand) && !isBot) {
            this.stand();
        }
    }

    private void checkAce(ArrayList<Card> hand) {
        int total = this.calculateTotal(hand);

        if (total > 21) {
            for (Card c : hand) {
                if (c.getRank().equals("A")) {
                    c.setValue(1);

                    // Edge Case: if we have 2 aces, we only want to set 1 of the aces to a value of
                    // 1, keeping the other ace a 11

                    // Edge Case: we have 2 aces, but we have other cards too, the total goes over
                    // 21, we want both aces to be a 1

                    total = this.calculateTotal(hand);

                    if (total > 21) {
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    /**
     * Calculates the sum of the card values in cards
     * @param cards this.playerDeck or this.botDeck
     * @return The sum of all the card values in the deck
     */
    private int calculateTotal(ArrayList<Card> cards) {
        int total = 0;

        for (int i = 0; i < cards.size(); i++) {
            total += cards.get(i).getValue();
        }

        return total;
    }

    /**
     * Returns whether or not the player lost
     * @param hand this.playerDeck or this.botDeck
     * @return if total value of all cards in hand > 21 (or if they bust)
     */
    private boolean lost(ArrayList<Card> hand) {
        return this.calculateTotal(hand) > 21;
    }
}