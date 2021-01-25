public class SnackDriver {
    public static void main(String[] args)
    {
        Snack choiceOne = new Snack("cookie", 100);
        Snack choiceTwo = new Snack();

        System.out.println(choiceOne.getCalories());
        System.out.println(choiceTwo.getCalories());
    }
}
