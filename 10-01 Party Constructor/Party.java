public class Party {

   private int numberOfPeople;
   private boolean isPartyFun;
   private boolean isPartyStarted;
   
   public Party()
   {
      numberOfPeople = 4;
      isPartyFun = true;
   }
   public Party(boolean started)
   {
      isPartyStarted = started;
   }
   
   public void makePartyFun()
   {
      isPartyFun = true;
   }
   
   public void addPersonToParty()
   {
      numberOfPeople = numberOfPeople + 1;
   }
   
   public void printPartyStatus()
   {
      System.out.println("numberOfPeople = "+numberOfPeople);
      System.out.println("isPartyFun = "+isPartyFun);
      System.out.println("isPartyStarted = "+isPartyStarted);
   }
}