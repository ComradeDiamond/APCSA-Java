public class Snack 
{
  private String name;
  private int calories;
  
  public Snack()
  {
     name = "";
     calories = 0;
  }

  public Snack(String n, int c)
  {
    name = n;
    calories = c;
  }

  public String getName()
  {
      return name;
  }
  
  public int getCalories()
  {
    return calories;
  }

  public void setName(String n)
  {
    name = n;
  }

  public void setCalories(int c)
  {
    calories = c;
  }

  private boolean canEat() 
    {
      return (calories < 150);
    }
}