
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
        
        char [] c_arr = valueToBeReversed.toCharArray();
        String s = "";
        for(int i = c_arr.length -1; i>=0; i--){
            s +=c_arr[i];
        }
        
        return s;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len_word = word.length();
        char c;
        if (len_word%2 == 0){
            c = word.charAt((len_word/2)-1);
        }
        else{
         c = word.charAt(len_word/2);
        }
        return c;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String s ="";
        String [] split_string = value.split(Character.toString(charToRemove));
        
        for(int i=0; i < split_string.length; i++){
            s += split_string[i];
        }
        
        return s;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String [] words = sentence.split(" ");
        String lastword = words[words.length-1];
        return lastword;
    }
}
