import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. The main part
 * of the post consists of a (possibly multi-line) text message. Other data,
 * such as author and time, are also stored.
 * @author Michael Kölling and David J. Barnes
 * @author Justin
 * @version 0.2
 */
public class MessagePost extends Post {
    /**
     * An arbritarily long, multi-line message
     */
    private String message; // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * @param author The username of the author of this post.
     * @param text   The text of this post.
     */
    public MessagePost(String author, String text) {
        super(author, System.currentTimeMillis(), 0, new ArrayList<>());
        this.message = text;
    }

    /**
     * Display the details of this post.
     * This displays a messagePost
     * (Currently: Print to the text terminal. This is simulating display in a web
     * browser for now.)
     */
    public void display() {
        System.out.println("----------");
        System.out.println(this.username);
        System.out.println(this.message);
        
        super.display();
    }
}