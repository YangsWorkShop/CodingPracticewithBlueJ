
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
        StringBuilder result = new StringBuilder();
        result.append(baseValue);
        result.append(valueToBeAdded);
        return result.toString();
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char[] input = valueToBeReversed.toCharArray();
        int begin = 0;
        int end = input.length - 1;
        char temp;
        while(end > begin){
            temp = input[begin];
            input[begin]= input[end];
            input[end] = temp;
            end--;
            begin++;
        }
        return new String(input);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if(word == null || word.length() == 0) {
            return null;
        }
        char[] chars = word.toCharArray();
        int l = 0; 
        int r = chars.length - 1;
        int mid = l + (r - l) / 2;
        return chars[mid];

    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        if(value == null || value.length() == 0) {
            return null;
        } 
        char[] array = value.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(array[i] != charToRemove) {
                sb.append(array[i]);
            }
        }
        return sb.toString();
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
         if(sentence == null) {
            return null;
        }
        String[] words = sentence.split(" ");
        return words[words.length - 1];
    }
}
