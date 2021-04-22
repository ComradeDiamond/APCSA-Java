//Authors(s): Bruno Robles
/*class desciption: The constructor should take a parameter that indicates the number of days in advance that this ticket is being purchased. Tickets purchased ten or more days in advance cost $30; tickets purchased nine or fewer days in advance cost $40.*/

public class Advance extends Ticket
{
  private int daysInAdvance;
  //private double ticketPrice;

  public Advance(int daysInAdvance)
  {
    //If daysInAdvance >= 10, return 30, or else return 40
    super(daysInAdvance >= 10 ? 30 : 40);
    //int ticketPrice;
    this.daysInAdvance = daysInAdvance;

    /*if(daysInAdvance >= 10)
      ticketPrice = 30;
    else
      ticketPrice = 40;*/
  }

  public int getDayInAdvance()
  {
    return daysInAdvance;
  }

  /*public double getPrice()
  {
    return ticketPrice;
  }*/

  public void setPrice(double newPrice)
  {
    super.setPrice(newPrice);
  }
  
  public String toString()
  {
    //return "Number: " + getDayInAdvance() +"\nPrice : " + getTicketPrice();
    return super.toString() + " - Days purchased in advance: " + this.daysInAdvance;
  }
}