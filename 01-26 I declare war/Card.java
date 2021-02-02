/**
 * The card class represents a card.
 * @author Blackjack Boys
 * @since 1/30/21
 */
public class Card {
	/**
	 * Represents the face of the card - king, queen, jack, ace
	 */
	private String face;
	/**
	 * Represents the suit of the card. I have no idea what this means lol
	 */
	private String suit;
	/**
	 * Represents the value of the card
	 */
	private int value;

	/**
	 * Constructs a card object
	 * @param face The card face
	 * @param suit The card suit
	 * @param value The card value
	 */
	public Card(String face, String suit, int value) {
		this.face = face;
		this.suit = suit;
		this.value = value;
	}

	/**
	 * Accessor method for card face
	 * @return this.face
	 */
	public String getFace() {
		return this.face;
	}

	/**
	 * Accessor method for suit
	 * @return this.suit
	 */
	public String getSuit() {
		return this.suit;
	}

	/**
	 * Accessor method for value
	 * @return this.value
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Convert the card into a printable string. 
	 * @return The card, in a String form with face-suit-value
	 */
	public String toString() {
		return "(" + this.face + "-" + this.suit + "-" + this.value + ")";
	}
}
