import java.util.Scanner;

public class Main {
  /**
   * The ranks of the cards for this game to be sent to the deck.
   */
  private static final String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

  /**
   * The suits of the cards for this game to be sent to the deck.
   */
  private static final String[] SUITS = { "♠", "♥", "♦", "♣" };

  /**
   * The values of the cards for this game to be sent to the deck.
   */
  private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };

  private static final Scanner leScan = new Scanner(System.in);

  public static void main(String[] args) {
    // beginningDeck is the Deck we start with. When we deal, it gets split into two
    // Decks for each player
    Deck beginningDeck = new Deck(RANKS, SUITS, POINT_VALUES);
    beginningDeck.shuffle();
    // System.out.println(beginningDeck);

    // There are nine cards on the table using an array
    Card[] cardsOnTable = new Card[9];

    for (int i = 0; i < 9; i++) {
      cardsOnTable[i] = beginningDeck.deal();
    }

    System.out.print(" ");

    while (!lost(cardsOnTable) && !won(cardsOnTable)) {
      showCardPile(cardsOnTable);
      int[] indexes = obtainCardIdx(cardsOnTable);

      if (indexes == null)
        continue;

      // User chooses a combo
      if (indexes.length == 3) {
        Card[] targetCards = { cardsOnTable[indexes[0]], cardsOnTable[indexes[1]], cardsOnTable[indexes[2]] };

        if (hasTriple(targetCards)) {
          removeIdx(cardsOnTable, indexes);
        } else {
          System.out.println("That's not a Jack, Queen, and King combo. Try again.");
          continue;
        }
      } else {
        // User chooses 2 cards that add to 11
        if (cardsOnTable[indexes[0]].pointValue() + cardsOnTable[indexes[1]].pointValue() == 11) {
          removeIdx(cardsOnTable, indexes);
        } else {
          System.out.println("That does not add to 11. Try again.");
          continue;
        }
      }
      fillIn(cardsOnTable, beginningDeck);
    }

    if (won(cardsOnTable)) {
      showCardPile(cardsOnTable);
      System.out.println("WE WIN THESE");
    } else if (lost(cardsOnTable)) {
      showCardPile(cardsOnTable);
      System.out.println("You lost lol, there's no more possible moves");
    }
  }

  /**
   * Postcondition: Sets the card indexes specified in the indexes in indexes to
   * null.
   *
   * Postcondition: cards is not null, the indexes at which cards should be
   * removed has a card
   *
   * @param cards   the current cards on the table
   * @param indexes the indexes from the current cards to remove
   * @return void
   */
  private static void removeIdx(Card[] cards, int[] indexes) {
    for (int idx : indexes) {
      cards[idx] = null;
    }
  }

  /**
   * Checks whether the player has a triple of J, Q, or K
   *
   * Postcondition: cards is not null
   *
   * @param cards the current cards on the table to check
   * @return true if the player has a triple of J, Q, K, false otherwise
   */
  private static boolean hasTriple(Card[] cards) {
    boolean seenJack = false;
    boolean seenQueen = false;
    boolean seenKing = false;

    for (int i = 0; i < cards.length; i++) {
      Card card = cards[i];

      if (cards[i] == null) {
        return false;
      }

      // Found J, Q, K
      if (card.rank().equals("J"))
        seenJack = true;
      if (card.rank().equals("Q"))
        seenQueen = true;
      if (card.rank().equals("K"))
        seenKing = true;
    }

    return seenJack && seenQueen && seenKing;
  }

  /**
   * Checks whether the player is out of possible moves
   *
   * Postcondition: cards is not null
   *
   * @param cards the current cards on the table to check
   * @return true if the player is out of moves, false otherwise
   */
  private static boolean lost(Card[] cards) {
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] == null) {
        continue;
      }

      for (int j = 0; j < cards.length; j++) {
        if (cards[j] == null) {
          continue;
        }

        // We don't want to compare the current card to itself
        if (cards[i].matches(cards[j]))
          continue;

        // Successfully found a pair that adds up to 11 or is a valid J, Q, K triple
        if (((cards[i].pointValue() + cards[j].pointValue()) == 11) || hasTriple(cards)) {
          return false;
        }
      }
    }

    return true;
  }

  /**
   * Given the user input, return the card indexes it's trying to target.
   * Precondition: The card indexes are seperated by a space Postcondition: If the
   * user's card indexes are a bit wack, stop parsing and tell the user it's wack
   * Postcondition: WILL RETURN NULL IF THE CARDIDX IS WACK Postcondition: WILL
   * RETURN NULL IF THE ITEM AT CARDIDX IS NULL
   * 
   * @param cardsOnTable The cardsOnTable you created at the start of the game
   */
  private static int[] obtainCardIdx(Card[] cardsOnTable) {
    boolean error = false;
    String[] x = leScan.nextLine().split(" ");
    int[] indexes = new int[x.length];

    if (x.length > 3) {
      System.out.println("You can only match up to 3 numbers.");
      error = true;
    }

    if (x.length < 2) {
      System.out.println("You need to match more than 2 numbers.");
      error = true;
    }

    for (int i = 0; i < x.length && !error; i++) {
      int currentIdx;

      try {
        currentIdx = Integer.parseInt(x[i]) - 1;
      } catch (Exception e) {
        System.out.println("Bruh you didn't insert a number");
        error = true;
        break;
      }

      if (currentIdx > 8 || currentIdx < 0) {
        System.out.println("The index is out of bounds.");
        error = true;
        break;
      }

      if (cardsOnTable[currentIdx] == null) {
        System.out.println("There is nothing at the index you specified.");
        error = true;
        break;
      }

      indexes[i] = currentIdx;
    }

    if (error) {
      System.out.println("Enter again.");
      return null;
    } else {
      return indexes;
    }
  }

  /**
   * Fills in the cards Postcondition: If the deck runs out of cards, just mark
   * that spot with a null
   * 
   * @param cardsOnTable  The card pile to fill in.
   * @param beginningDeck The deck generated at the start of the game
   */
  private static void fillIn(Card[] cardsOnTable, Deck beginningDeck) {
    for (int i = 0; i < cardsOnTable.length; i++) {
      if (cardsOnTable[i] == null) {
        cardsOnTable[i] = beginningDeck.deal();
      }
    }
  }

  /**
   * Determines whether player has won. Player has won when cardsOnTable is all
   * null.
   * 
   * @param cardsOnTable The cards on table we created in the beginning of the
   *                     game
   * @return true if we have all the cards removed, false otherwise
   */
  private static boolean won(Card[] cardsOnTable) {
    int count = 0;

    for (Card card : cardsOnTable) {
      if (card == null)
        count++;
    }

    return count == cardsOnTable.length;
  }

  /**
   * Displays all the cards on the table in the console.
   * 
   * @param cardsOnTable The cards on table to show
   * @return void
   */
  private static void showCardPile(Card[] cardsOnTable) {
    System.out.println();
    System.out.print(" ");
    for (int i = 0; i < 9; i++)
      System.out.print((i + 1) + "    ");
    System.out.println();
    for (int i = 0; i < 9; i++)
      System.out.print(cardsOnTable[i] + ((i != 8) ? ", " : "\n"));
  }
}
