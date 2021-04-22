public class Ticket 
{
  private static int serialNumber = 100; //unique ticket id number

  private int number;
  private double price;

  public Ticket()
  {
    Ticket.serialNumber = getNextSerialNumber();
  }

  public Ticket(double price)
  {
    this.price = price;
    this.number = Ticket.serialNumber;
    Ticket.serialNumber = getNextSerialNumber();
  }

  //Default ticket price (might be overridden)
  public double getPrice()
  {
    return this.price;
  }

  //sets price of ticket
  public void setPrice(double newPrice)
  {
    price = newPrice;
  }

  //returns a string with serial number and price
  public String toString()
  {
    return "Serial Number: " + this.number + " \nPrice: $" + this.price;
  }

  //returns a new unique serial number
  private static int getNextSerialNumber() { 
    return serialNumber + 1;
  }
}