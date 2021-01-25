public class SecretWord {
    private String word;

    public SecretWord(String w)
    {
        this.word = w;
    }

    /**
     * Precondition: parameter num is less than the length of word
     * Postcondition: Returns the string of the characters of word from index num to the 
        * characters of word from index num to end of word followed by index 0 to num, not including num
     * @param num: index number
     * @return: String
     */
    public String newWord(int num)
    {
        return this.word.substring(num, this.word.length()) + this.word.substring(0, num);
    }
}
