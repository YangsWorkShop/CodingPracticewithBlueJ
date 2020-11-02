
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
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
        if (valueToBeReversed.length() == 0 || valueToBeReversed == null) {
            return valueToBeReversed;
        }
        StringBuilder result = new StringBuilder();
        for (int i = valueToBeReversed.length() - 1; i >= 0; i--){
            result.append(valueToBeReversed.charAt(i));
        }
        return result.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        return word.charAt(word.length() / 2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        if (value == null || charToRemove == null) {
            return value;
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < value.length(); ++i) {
            if (value.charAt(i) != charToRemove) {
                s.append(value.charAt(i));
            }
        }
        return String.valueOf(s);
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] strs = sentence.split(" ");
        return strs[strs.length - 1];
    }
}
