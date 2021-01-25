public class ArraysOfObjects
{

  public static void main(String[] args)
  {
     Triangle[] triAr = new Triangle[100];
     Point p1,p2,p3;
     for (int i = 0; i < triAr.length; i++)
     {
        //Make three random points - using a "do-while" to make sure there are
        //no repeats.
        do {
             p1 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p2 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
             p3 = new Point((int) (Math.random()*6), (int) (Math.random()*6));
        } while (p1.equals(p2) || p1.equals(p3) || p3.equals(p2));
        
        //Construct a new Triangle from the points and put them into the array.
        triAr[i] = new Triangle(p1,p2,p3);
     }
    for (Triangle tri:triAr)
     {
        System.out.println(tri);
     }
     //Count the right triangles
     int countRightTris = 0;
     for (Triangle tri : triAr)
     {
        if (tri.isRight())
        {
           countRightTris++;
        }
     }
     double rightTrisPercent = ((double)countRightTris/triAr.length)*100;
     System.out.println("Percent of Right Triangles: " + rightTrisPercent + "%");

     //Find the average perimeter of the whole list.
     int sumPerimeter = 0;

     for (Triangle tri : triAr)
     {
      sumPerimeter += tri.perimeter();
     }

     double averagePerimeter = sumPerimeter / triAr.length;
     System.out.println("Average Perimeter: " + averagePerimeter);

     //Look for your favorite property in the array of Triangles
     int numEquilateral = 0;

     for (Triangle tri : triAr)
     {
        if (tri.isEquilaterial())
        {
           numEquilateral++;
        }
     }

     double numEquiPercent = ((double)numEquilateral / triAr.length)*100;
     System.out.println("Percent of Equilateral Triangles: " + numEquiPercent + "%");

     //Do something similar with Fraction 
     //Step 1: make an array of Fractions
     Fraction[] fratArr = new Fraction[99];
     //Step 2: Construct random Fractions to fill out the array

     int num, denom;
     for (int i = 0; i < fratArr.length; i++)
     {
         num = (int) Math.round(Math.random() * 100);
         denom = (int) Math.round(Math.random() * 99 + 1);
        
        fratArr[i] = new Fraction(num, denom);
     }

     //Prints out the fractions
     for (Fraction frat : fratArr)
     {
        System.out.println(frat);
     }

     //Step 3: Find how many of the Fractions have your favorite property.
     int numImproper = 0;
     for (Fraction frat : fratArr)
     {
        if (frat.getValue() >= 1)
        {
           numImproper++;
        }
     }

     double percentImproper = ((double)numImproper / fratArr.length) * 100;
     System.out.println("Percentage of Improper Fractions: " + percentImproper + "%");
  }
}