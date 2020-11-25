public class TriangleRunnerEqualsTests
{
  public static void main(String[] args) 
  {
     Point p1 = new Point(0.0,0.0);
     Point p2 = new Point(0.0,0.0);
     Point p3 = new Point(3.0,4.0);

     Point p11 = new Point(0.0,0.0);
     Point p22 = new Point(0.0,0.0);
     Point p33 = new Point(3.0,4.0);
          
     Triangle t1 = new Triangle(p1,p2,p3);
     Triangle t2 = new Triangle(p11, p22, p33);
          
     System.out.println("t1 = "+t1);
     
     System.out.println("p1.equals(p2) is "+p1.equals(p2));
     System.out.println("p1 == p2 is "+(p1 == p2));

     System.out.println("t1 == t1 is " + (t1 == t2));
     System.out.println("t1.equals(t2) is " + t1.equals(t2));
  
   }
}