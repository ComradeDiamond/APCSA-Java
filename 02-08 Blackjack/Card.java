/**
 * Represents a card object in the game
 * 
 * @author BlackJackBoys
 */
public class Card {
    /**
     * Rank of the card
     */
    private String rank;

    /**
     * Suit of the card
     */
    private String suit;

    /**
     * Value of the card
     */
    private int value;

    /**
     * Constructs a card object.
     * 
     * @param rank  Card rank
     * @param suit  Card suit
     * @param value Card value
     */
    public Card(String rank, String suit, int value) {
        this.rank = rank;
        this.suit = suit;
        this.value = value;
    }

    /**
     * Accessor method for card rank
     * 
     * @return this.rank
     */
    public String getRank() {
        return this.rank;
    }

    /**
     * Accessor method for card suit
     * 
     * @return this.suit
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * Accessor method for card value
     * 
     * @return
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Mutator method for card value. Postcondition: changes this.value to value
     * 
     * @param value The value to set this.value to
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Converts the card to a printable string form
     * 
     * @return This card, as a string
     */
    public String toString() {
        return this.rank + " " + this.suit;
    }
}