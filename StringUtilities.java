
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
    	String res = valueToBeReversed;
    	res = new StringBuffer(res).reverse().toString();
        return res;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
    	Integer len = word.length();
    	char[] arr = word.toCharArray();
    	Character res = 'a';
    	if(len % 2 == 0) {
    		res = arr[len / 2 - 1];
    	} else if(len % 2 == 1) {
    		res = arr[(len + 1) / 2 - 1];
    	}
        return res;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {

    	char[] arr = value.toCharArray();
    	String res = "";
    	for(Integer i = 0; i < arr.length; i ++) {
    		if(arr[i] != charToRemove) {
    			res += arr[i];
    		}
    	}
        return res;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
    	String[] arr = sentence.split("\\s+");
    	Integer len = arr.length;
        return arr[len - 1];
    }
}
