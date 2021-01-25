import java.util.*;

public class RemoveVowellsNotY
{
    public static void main(String[] args)
    {
        String[] wordArray = {"proof", "a", "can", "everything", "slyly", "you", "invisible", "myths", "gypsy"};
        List<String> wordList = new ArrayList<>(Arrays.asList(wordArray));
        System.out.println(wordList);
        removeVowelWords(wordList);
        System.out.println(wordList);
    }

    public static void removeVowelWords(List<String> words)
    {
        for (int i = words.size() - 1; i >= 0; i--)
        {
            String replaced = words.get(i).replaceAll("[aeiou]", "");

            if (!replaced.equals(words.get(i)))
            {
                words.remove(i);
            }
        }
    }
}