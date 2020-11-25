/**Assignment class - basically a HW or CW Assignment
 * @author Justin
 * @since 11/25/20
 */

public class Assignment
{
    private static int nextAssignmentID = 1;
    private String name;
    private int pointValue;
    private int assignmentID;

    /**Makes a constructor that gives the assignment a unique assignment ID
     * Precondition: pointVal >= 0
     * Postcondition: constructs an assignment obj with name name and pointValue pointVal
     * @param name name of the assignment
     * @param pointVal point value of the assignment
     */
    public Assignment(String name, int pointVal)
    {
        this.assignmentID = nextAssignmentID;
        Assignment.nextAssignmentID++;

        this.name = name;
        this.pointValue = pointVal;
    }

    /**Returns the % that the student got on the assignment
     * Precondition: score >= 0
     * Postcondition: Finds the percent correct the student got based on score you put in
     * @param score The score of the student
     * @return The percent correct the student got
     */
    public double getPercent(int score)
    {
        return (double) score / this.pointValue * 100;
    }

    /**Returns the number of assignments that exist
     * @return number of assignments created
     */
    public static int getNumAssignments()
    {
        return Assignment.nextAssignmentID - 1;
    }
}