
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        String result = input;
        return result;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue + valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {

        char[] letters = valueToBeReversed.toCharArray();
        int i = 0;
        int j = valueToBeReversed.length() - 1;
        
        while(i < j) {
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp;
            i = i + 1;
            j = j - 1;
        }
        
        return new String(letters);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int mid = word.length() / 2;
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String charToRemoveString = Character.toString(charToRemove);
        String result = value.replace(charToRemoveString, "");
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String result = "";
        String[] words = sentence.split(" ");
        result = words[words.length-1];
        return result;
    }
}
