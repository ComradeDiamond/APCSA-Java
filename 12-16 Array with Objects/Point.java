public class Point
{
  private double x;
  private double y;
  
  public Point(double setX, double setY)
  {
      x = setX;
      y = setY;
  }
   
   public void setX(double setX) 
   { 
       x = setX;
   }
   
   public void setY(double setY)
   {
       y = setY;
   }
   
   public double getX()
   {
      return x;
   }
   
   public double getY()
   {
       return y;
   }
   
   //Distance between two points
   public double distance(Point other)
   {
      return Math.sqrt(Math.pow(other.getY()-this.getY(),2) +
               Math.pow(other.getX() - this.getX(),2));
   }
   
   public boolean equals(Point other)
   {
      return (this.getX() == other.getX() && this.getY() == other.getY());
   }

   
   public String toString()
   {
      return "("+getX()+","+getY()+")";
   }
}