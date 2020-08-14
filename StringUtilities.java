
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue      value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {

        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {

        String reversed = "";
        for (int i = valueToBeReversed.length()-1 ; i >= 0; i--) {
            reversed = reversed + valueToBeReversed.charAt(i);
        }
        return reversed;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int index = 0;
        if (word.length() % 2 == 0) {
            index = word.length() / 2 - 1;
        } else {
            index = word.length() / 2;
        }
        return word.charAt(index);
    }

    /**
     * @param value        value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String removed = "";
        char[] toValue = value.toCharArray();
        for (int i = 0; i < toValue.length; i++) {
            if (toValue[i] != charToRemove) {
                removed = removed + toValue[i];
            }
        }
        return removed;
    }


    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String []  lastWord = sentence.split(" ");
        return lastWord[lastWord.length-1];
    }
}

