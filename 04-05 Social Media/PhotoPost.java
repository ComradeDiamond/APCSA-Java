import java.util.ArrayList;

/**
 * This class stores information about a post in a social network. The main part
 * of the post consists of a photo and a caption. Other data, such as author and
 * time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @author Justin
 * @version 0.2
 */
public class PhotoPost extends Post {
    /**
     * Name of the file!
     */
    private String filename;

    /**
     * A one line image caption
     */
    private String caption;

    /**
     * Constructor for objects of class PhotoPost.
     * @param author   The username of the author of this post.
     * @param filename The filename of the image in this post.
     * @param caption  A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption) {
        super(author, System.currentTimeMillis(), 0, new ArrayList<>());

        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return the file name of the image in this post.
     * @return The post's image file name.
     */
    public String getImageFile() {
        return this.filename;
    }

    /**
     * Return the caption of the image of this post.
     * @return The image's caption.
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * Display the details of this post.
     * This simulates a photoPost doing the stuff
     * (Currently: Print to the text terminal. This is simulating display in a web
     * browser for now.)
     */
    public void display() {
        System.out.println("----------");
        System.out.println(this.username);
        System.out.println("  [" + this.filename + "]");
        System.out.println("  " + this.caption);
        
        super.display();
    }
}