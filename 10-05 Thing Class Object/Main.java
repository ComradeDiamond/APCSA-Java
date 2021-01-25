public class Main {
    public static void main(String[] args)
    {
        Thing popatoChisps = new Thing("Potato Chip");
        popatoChisps.printMessage();

        popatoChisps.whatHappenedHere();
        popatoChisps.printMessage();

        hey();
    }

    public static void hey()
    {
        System.out.print("waddup?");
    }
}
