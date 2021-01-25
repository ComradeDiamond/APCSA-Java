public class Main {
    public static void main(String[] args)
    {
        Assignment a1 = new Assignment("Fraction follow-up", 10);
        Assignment a2 = new Assignment("More codingbats", 6);

        System.out.println("score of 9 on Fraction follow-up has a % of: " + a1.getPercent(9));
        System.out.println("current assignmentId: " + Assignment.getNumAssignments());
    }
}
