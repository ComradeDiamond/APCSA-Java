/*class description: The constructor should take a parameter that indicates the number of days in advance that this ticket is being purchased. The toString method should include a notation that a student ID is required for this ticket. A StudentAdvance ticket costs half of what that Advance ticket would normally cost. If the pricing scheme for Advance tickets changes, the StudentAdvance price should continue to be computed correctly with no code modifications to the StudentAdvance class. */
public class StudentAdvance extends Advance
{

  public StudentAdvance(int daysInAdvance)
  {
    super(daysInAdvance);
    super.setPrice(super.getPrice() / 2);
  }

  /*public void setPrice(double newPrice)
  {
    ticketPrice = newPrice/2;
  }*/
  /**
  Number: 102
  Price: 15.00
  (student ID required)
  */
  public String toString()
  {
    return super.toString() + "\n(Student ID Required)"; //+"\n(student ID required)";
  }
}

