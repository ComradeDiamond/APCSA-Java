import java.util.Arrays;

/**
 * The runner for the username class.
 * @author Justin Chen
 * @since 2/10/21
 */
public class UserNameRunner {
    public static void main(String[] args)
    {
        //Part A
        System.out.println("Part (a): ");
        UserName johnSmith = new UserName("john", "smith");
        System.out.println("johnSmithPossibleNames = " + johnSmith.getPossibleNames());

        //Part B
        System.out.println("Part (b): ");

        UserName maryHart = new UserName("mary", "hart");
        String[] used = new String[]{"harta", "hartm", "harty"};

        System.out.println("Original maryHartPossibleNames = " + maryHart.getPossibleNames());
        System.out.println("resetting available names... with used[] = " + Arrays.toString(used));

        maryHart.setAvailableUserNames(used);
        System.out.println("After setting maryHartPossibleNames = " + maryHart.getPossibleNames());

        //Additional Test
        System.out.println("Additional Test: ");

        UserName dorothy = new UserName("dorothy", "vaughan");
        used = new String[]{"vaughand","vaughando"};

        System.out.println("Original dorothyVaughanPossibleNames = " + dorothy.getPossibleNames());
        System.out.println("resetting available names... with used[] = " + Arrays.toString(used));
        
        dorothy.setAvailableUserNames(used);
        System.out.println("After setting dorthyVaughanPossibleNames = " + dorothy.getPossibleNames());
    }
}
