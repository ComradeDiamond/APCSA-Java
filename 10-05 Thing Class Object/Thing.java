public class Thing
{
    private String name;

    Thing(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void printMessage()
    {
        System.out.println(this.name + "_is_great");
    }

    public void whatHappenedHere()
    {
        int x = this.name.length();
        int i = (int)(Math.random() * x);

        //Java is apparently deprecated 
        //this.name = this.name.slice(this.name[i], 1);

        //Strict type very very dumb
        String character = this.name.charAt(i) + "";

        this.name = this.name.replace(character, "");
    }
}