
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
        String reversedValue = "";
        for(int i = 0; i < valueToBeReversed.length(); i++ ){
        	reversedValue += valueToBeReversed.charAt(valueToBeReversed.length()-1-i);
        }
    	return reversedValue;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {   	
        return word.charAt(word.length()/2);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
    	String removedValue = "";
    	for(int i = 0; i < value.length(); i++ ){
    		if(value.charAt(i) != charToRemove){
    			removedValue += value.charAt(i);
    		}
        	
        }
        return removedValue;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
    	for(int i = sentence.length()-1; i >0; i-- ){
    		if(sentence.charAt(i) == ' ' ){
    			return sentence.substring(i+1);
    		}
        	
        }
    	return sentence;
    }
}
