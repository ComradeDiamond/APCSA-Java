/**
 * A helper class that marks row and column results. 
 * Use this like JSON.
 * It's more for the AI we're making later.
 * @author Justin
 * @since 3/9/21
 */
public class Marker {
    /**
     * Tracks the number of occurances of a specific "X" and "Y".
     */
    public int numOccur;

    /**
     * Keeps track of at which index in the row grid is does there not exist a "X" or "Y". 
     * If numOccur is 0, don't bother and just make this -1 and -1. 
     * This is a coordinate pair. First index is x and second index is y
     */
    public int[] idxMissing;

    /**
     * Has the row or column been occupied by the opponent? 
     * This boolean will reflect that.
     */
    public boolean occcupied;    

    /**
     * Constructs a marker class given user input. Fair enough.
     * @param numOccur The number of times a specific "X" and "Y" occurs
     * @param idxMissing The index where the row or column we're scouting has a "missing" item.
     * @param occupied Whether or not the "row" or "column" is occupied by the opponent.
     */
    public Marker(int numOccur, int[] idxMissing, boolean occupied)
    {
        this.numOccur = numOccur;
        this.idxMissing = idxMissing;
        this.occcupied = occupied;
    }
}
