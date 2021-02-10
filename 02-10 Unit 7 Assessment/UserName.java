import java.util.ArrayList;

/**
 * The public class for storing usernames.
 * 
 * @author MyAP
 * @since 2/10/21 - actually idk when this was made
 */
public class UserName {
    /**
     * The list of possible user names, based on a user’s first and last names and
     * initialized by the constructor.
     */
    private ArrayList<String> possibleNames;

    /**
     * Constructs a UserName object as described in part (a). Precondition:
     * firstName and lastName have length greater than 0 and contain only uppercase
     * and lowercase letters.
     * @param firstName The first name
     * @param lastName The last name
     */
    public UserName(String firstName, String lastName) {
        this.possibleNames = new ArrayList<String>();
        
        //Loop through every index in firstName, and then substring the firstName to make a username
        for (int i = 1; i <= firstName.length(); i++) {
            this.possibleNames.add(lastName + firstName.substring(0, i));
        }
    }

    /**
     * Returns true if arr contains name, and false otherwise.
     * @param name The name to look for
     * @param arr  The arr to look for name in
     * @return Whether or not arr contains name
     */
    public boolean isUsed(String name, String[] arr) 
    {
        //Traverses the array, and if the name exists in arr, then it's a duplicate and isUsed
        for (String str : arr)
        {
            if (str.equals(name))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Removes strings from possibleNames that are found in usedNames as described in part (b).
     * Postcondition: possibleNames is modified and converted into an arraylist with only usernames that are unused
     * @param usedNames An array of usedNames that needs to be yeeted from this.possibleNames
     */
    public void setAvailableUserNames(String[] usedNames) 
    {
        //Go backwards to forwards to prevent deletion bug caused by shifting left
        for (int i = this.possibleNames.size() - 1; i >= 0; i--)
        {
            //If the userName is already used, remove it from the arraylist
            if (this.isUsed(this.possibleNames.get(i), usedNames))
            {
                this.possibleNames.remove(i);
            }
        }
    }

    /**
     * Accessor method to get the possible names in this.possibleNames.
     * Don't worry about printing this, println autocalls ArrayList.prototype.toString
     * @return this.getPossibleNames
     */
    public ArrayList<String> getPossibleNames()
    {
        return this.possibleNames;
    }
}