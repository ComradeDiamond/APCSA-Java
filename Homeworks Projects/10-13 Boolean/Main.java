public class Main
{
    public static void main(String[] args)
    {
        Boolean lightThemeBestTheme = true;
        Boolean usedLightTheme = true;
        Boolean isHeathen = false;

        System.out.println(usedLightTheme || isHeathen);
        //Since usedLightTheme is true, and or only needs
        //One true to determine that the whole condition
        //is true, isHeathen is not evaluated

        System.out.println(isHeathen && lightThemeBestTheme);
        //Since isHeathen is false, and and only needs one
        //false to determine that the whole condition is false,
        //lightThemeBestTheme is not evaluated and isHeathen 
        //Automatically returns false
    }
}