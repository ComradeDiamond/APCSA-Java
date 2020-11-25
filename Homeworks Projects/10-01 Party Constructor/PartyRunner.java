public class PartyRunner
{
   public static void main(String[] args)
   {
      Party birthdayParty = new Party();
      birthdayParty.printPartyStatus();
      Party firstDayParty = new Party(true);
      firstDayParty.printPartyStatus();
    }
 }
