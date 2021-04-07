import java.util.ArrayList;

/**
 * The superclass for everything social media code! Basically this will improve
 * Newsfeed.java and PhotoPost.java
 * @author Justin
 * @since 4/6/21
 */
public class Post {
    /**
     * The username of the kid that posted the social media post
     */
    protected String username;

    /**
     * The timestamp of when the post was created
     */
    private long timestamp;

    /**
     * The number of likes this has
     */
    private int likes;

    /**
     * Alot of comments yes
     */
    private ArrayList<String> comments;

    /**
     * Constructs a general post for people to blab about stuff
     * @param username  The username of the kid
     * @param timeStamp The timestamp of when the post was creted
     * @param likes     Haha get ratio'd
     * @param comments  Comments come flooding in yes
     */
    public Post(String username, long timeStamp, int likes, ArrayList<String> comments) {
        this.username = username;
        this.timestamp = timeStamp;
        this.likes = likes;
        this.comments = comments;
    }

    /**
     * Record one more like
     * @postcondition Likes++
     */
    public void like() {
        this.likes++;
    }

    /**
     * Wow people hate the post so much they gave you an unlike
     * @precondition this.likes > 0
     * @postcondition Likes--
     */
    public void unlike() {
        if (this.likes > 0) {
            this.likes--;
        }
    }

    /**
     * Add a comment to this post.
     * @param text The new comment to add.
     * @postcondition this.comments is modified
     */
    public void addComment(String text) {
        this.comments.add(text);
    }

    /**
     * Return the time of creation of this post.
     * @return The post's creation time, as a system time value.
     */
    public long getTimeStamp() {
        return this.timestamp;
    }

    /**
     * Create a string describing a time point in the past in terms relative to
     * current time, such as "30 seconds ago" or "7 minutes ago". Currently, only
     * seconds and minutes are used for the string.
     * @param time The time value to convert (in system milliseconds)
     * @return A relative time string for the given time
     */
    public String timeString(long time) {
        long current = System.currentTimeMillis();
        long pastMillis = current - time; // time passed in milliseconds
        long seconds = pastMillis / 1000;
        long minutes = seconds / 60;
        if (minutes > 0) {
            return minutes + " minutes ago";
        } else {
            return seconds + " seconds ago";
        }
    }

    /**
     * Displays the post!
     * This simple display will just display the timestamp, likes, and size.
     */
    public void display()
    {
        System.out.print(timeString(this.timestamp));

        if (likes > 0) {
            System.out.println("  -  " + this.likes + " people like this.");
        } else {
            System.out.println();
        }

        if (comments.isEmpty()) {
            System.out.println("   No comments.");
        } else {
            System.out.println("   " + this.comments.size() + " comment(s). Click here to view.");
        }
    }

    /**
     * Displays the comment stuff to stdout
     * Probably will add GUI or smth later idk
     * But for now we're just going to have this be boring bc you can't click without doing 
     * :vomit: stuff with javax
     */
    public void displayComment()
    {
        System.out.println("COMMENTS\n--------");

        for (String comment : this.comments)
        {
            System.out.println("> " + comment);
        }

        System.out.println("--------");
    }
}
