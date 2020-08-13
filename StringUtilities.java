
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
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        if(valueToBeReversed == null){
            return valueToBeReversed;
        }
        String output="";
        for(int i = valueToBeReversed.length()-1;i>=0;i--){
            output = output + valueToBeReversed.charAt(i); 
        }
        return output;
       /* StringBuilder string1 = new StringBuilder();
        string1.append(valueToBeReversed);
        string1 = string1.reverse();
        return string1.toString();*/
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len = word.length();
        int mid=0;
        if(len%2==0){
            mid = (len/2)-1;
        }
        else{
            mid = len/2;
        }
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char[] valuearr = value.toCharArray();
        String res="";
        for(int i=0;i<valuearr.length;i++){
            if(valuearr[i]!=charToRemove){
                res += valuearr[i];
            }
        }
        
        return(res);
        
        /*int idx = value.indexOf(charToRemove); 
        return(value.substring(0, idx) + value.substring(idx + 1));*/
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        return(sentence.substring(sentence.lastIndexOf(" ")+1));
    }
}
