import java.util.*;

/**
 * Represents a player
 * @since 1/28/21
 * @author Blackjack Boys
 */
public class Player {
  /**
   * Represents the player's hands
   */
	private ArrayList<Card> hand = new ArrayList<Card>();

  /**
   * Creates a player object.
   * Precondition: deck.size() >= 26
   * Postcondition: The player recieves 26 cards drawn from deck
   * Postcondition: The first 26 cards in the deck stack is drawn
   * @param deck The deck to draw from
   */
	public Player(Deck deck) {
		for (int i=0; i < 26; i++)
		{
			this.hand.add(deck.draw());
		}
	}

  /**
   * Accessor method that returns the player's hand size
   * @return this.hand.size();
   */
  public int handSize() {
    return this.hand.size();
  }

  /**
   * Takes a pile, and siphons all the card in the pile to the bottom of the player's hand
   * @param pile The pile to siphon all the cards from
   */
  public void siphonWinCards(ArrayList<Card> pile)
  {
    for (int i = pile.size() - 1; i >= 0; i--)
    {
      this.hand.add(pile.remove(i));
    }
  }

  /**
   * Shuffles the player's hands.
   * For every card in the player's stack, replace that card with a random card
   */
  public void shuffle() {
		int x = this.hand.size();

		for (int i = 0; i < x; i++) {
			int randIdx = (int) (Math.random() * x);
			// Set returns element before we yeeted it
			Card removed = this.hand.set(randIdx, this.hand.get(i));
			this.hand.set(i, removed);
		}
	}

  /**
   * Plays <number> cards from the player's hands.
   * Precondition: number <= this.hand.size(), but there's error checking built in
   * @param number The number of cards to draw from the player's hands
   * @return A stack that contains all the cards the player played (well it's supposed to be a stack)
   */
  public ArrayList<Card> play(int number)
  {
    ArrayList<Card> toRet = new ArrayList<>();
    for (int i = 0; i < number; i++)
    {
      if (this.hand.size() > 0)
      {
        toRet.add(this.hand.remove(this.hand.size() - 1));
      }
    }
    return toRet;
  }
}