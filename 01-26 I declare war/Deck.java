import java.util.*;

/**
 * Represents a deck
 * @author Blackjack Boys
 * @since 1/28/21
 */
public class Deck {
	/**
	 * Represents the collection of cards in the deck.
	 * It's supposed to be a "stack"
	 */
	private ArrayList<Card> cards;

	/**
	 * Constructs a deck class.
	 * This will construct cards of all values A-K, with a copy of each value having one of the 4 suits
	 * We also add the faces for JKQA
	 */
	public Deck() {
		cards = new ArrayList<Card>();
		String[] faces = { "KING", "QUEEN", "JACK", "ACE" };
		String[] suits = { "SPADE", "HEART", "CLOVER", "DIAMOND" };

		for (int i = 0; i < 4; i++) {
			// Regular cards
			for (int j = 2; j <= 10; j++) {
				this.cards.add(new Card(faces[i], suits[i], j));
			}

			// J, K, Q, A
			for (int k = 0; k < 4; k++) {
				// Account for value of A
				this.cards.add(new Card(faces[k], suits[i], k == 3 ? 1 : 10));
			}
		}
	}

	/**
	 * Overloaded constructor for the deck class.
	 * Basically you take a stack of cards and call that your deck.
	 * @param cardDeck The card deck to turn the current deck into.
	 */
	public Deck(ArrayList<Card> cardDeck) {
		this.cards = cardDeck;
	}

	/**
	 * Shuffles the deck.
	 * @see Player.prototype.shuffle();
	 */
	public void shuffle() {
		int x = this.cards.size();

		for (int i = 0; i < x; i++) {
			int randIdx = (int) (Math.random() * x);
			// Set returns element before we yeeted it
			Card removed = this.cards.set(randIdx, this.cards.get(i));
			this.cards.set(i, removed);
		}
	}

	/**
	 * Draws a card from the stack.
	 * Precondition: this.cards.size() > 0
	 * Postcondition: removes the top card in the stack
	 * @return The top card in the stack
	 */
	public Card draw() {
		return this.cards.remove(this.cards.size() - 1);
	}

	/**
	 * Returns the number of cards in the stack
	 * @return this.cards.size();
	 */
	public int size() {
		return this.cards.size();
	}

	/**
	 * @return whether the card stack is empty
	 */
	public boolean isEmpty() {
		return this.cards.size() == 0;
	}

	/**
	 * Converts the stack into a string. Essentially, we just return the arraylist cards into a string
	 */
	public String toString() {
		return cards.toString();
	}
}
