public class Main {
   public static void main(String[] args)
   {
       Party leParty = new Party(true, false, 3);
       String partyJSON = leParty.toString(); //Feels weird XD

       System.out.println(partyJSON);
   } 
}
