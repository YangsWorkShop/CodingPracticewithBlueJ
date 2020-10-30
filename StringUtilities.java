
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
        char[] c = valueToBeReversed.toCharArray();
        String res = "";
        for(int i = c.length - 1; i >= 0; i--){
            res += c[i];
        }
        return res;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int n = word.length();
        return word.charAt(n/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String res = "";
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) != charToRemove){
                res += value.charAt(i);
            }
        }
        return res;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int idx = sentence.length()-1;
        while(sentence.charAt(idx) != ' '){
            idx--;
        }
        String res = "";
        for(int i = idx+1; i < sentence.length(); i++){
            res += sentence.charAt(i);
        }
        return res;
    }
}
