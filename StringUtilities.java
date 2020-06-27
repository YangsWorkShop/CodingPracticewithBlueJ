
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
        StringBuilder b = new StringBuilder(valueToBeReversed);
        for(int i = 0; i < b.length() / 2; i++){
            char current = b.charAt(i);
            int otherEnd = b.length() - i - 1;
            b.setCharAt(i, b.charAt(otherEnd));
            b.setCharAt(otherEnd, current);
        }
        
        return b.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        if(word.length() % 2 == 0){
            return word.charAt(word.length() / 2 -1);
        }
        return word.charAt(word.length() / 2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
       String result = "";
       for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) != charToRemove){
                result +=value.charAt(i);
            } else {continue;}
        }
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return sentence.substring(sentence.lastIndexOf(" ") + 1);
    }
}
