public class Main {
    public static void main(String[] args)
    {
        //This is my APCSA classwork btw lmao
        NewsFeed idk = new NewsFeed();
        MessagePost p1 = new MessagePost("Seal", "Becc go to the bin");
        MessagePost p2 = new MessagePost("Cat", "Light theme best theme");

        idk.addMessagePost(p1);
        idk.addMessagePost(p2);

        p1.addComment("TRUE!");
        p1.addComment("Yes becc should go to de bin for weebery");
        p1.unlike();

        String[] comments = new String[] {
            "I agree",
            "Yes if you disagree you're a heathen",
            "Yes light mode best theme",
            "Srs bot agrees",
            "Pls convert",
            "I beg everyone to convert pls :pleadEyes:",
            "Yes don't use the uglier theme",
            "Why is Justin coding in dark mode",
            "Why is VSC dark mode smh my head go to the bin"
        };
        
        for (String str : comments)
        {
            p2.addComment(str);
        }

        for (int i =0; i < 1000; i++)
        {
            p2.like();
        }

        idk.show();

        p2.displayComment();
    }
}
