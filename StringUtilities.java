
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
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        int i = 0, j = valueToBeReversed.length() - 1;
        char[] array = valueToBeReversed.toCharArray();
        while (i < j) {
        	char temp = array[i];
        	array[i]= array[j];
        	array[j]= temp;
        	i++;
        	j--;
        }
        return new String(array);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int middleIndex = word.length() / 2;
	return word.charAt(middleIndex);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder sb =  new StringBuilder();
        for (char eachChar : value.toCharArray()) {
        	if (eachChar == charToRemove) continue;
        	sb.append(eachChar);
        }
        return new String (sb.toString());
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] list  = sentence.split(" ");
        return list[list.length - 1];
    }
}
