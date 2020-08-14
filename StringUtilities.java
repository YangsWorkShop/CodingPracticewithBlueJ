
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
        char[] arr = valueToBeReversed.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        return new String(arr);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char[] arr = word.toCharArray();
        if (arr.length == 0) {
            return null;
        }
        int i = arr.length - 1;
        return arr[i/2];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] arr = value.toCharArray();
        int slow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != charToRemove) {
                arr[slow] = arr[i];
                slow++;
            }
        }
        return new String(arr, 0, slow);
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] str = sentence.split(" ");
        return str[str.length - 1];
    }
}
