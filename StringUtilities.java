
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
//    	String temp = value.split("\\s+");
    	char[] arr = value.toCharArray();
    	String res = "";
    	for(Integer i = 0; i < arr.length; i ++) {
    		if(arr[i] != charToRemove) {
    			res += arr[i];
    		}
    	}
//    	String temp = value;
//    	String[] proc = {"a"};
//    	int[] sig = {0};
////    	Integer sig = value.indexOf(charToRemove);
//    	Integer len = value.length();
//    	char[] arr = value.toCharArray();
//    	String res = "";
//    	String sub1 = "";
//    	String sub2 = "";
//    	Integer j = 0;
//    	for(Integer i = 0; i < len; i ++) {
//    		if(j == 0) {
//    			sig[j++] = temp.indexOf(charToRemove);
//    			temp = temp.substring(sig[0] + 1, len);
//    		} else {
//    			sig[j++] = temp.indexOf(charToRemove)+sig[j-1]+1;
////        		proc[j++] = temp.substring(0,sig);
//        		temp = temp.substring(sig[j - 1] + 1, len);
//    		}
//    	}
//    	res += value.substring(0,sig[1]);
//    	for(Integer k = 1; k < sig.length ; k ++) {
//    		res += value.substring(sig[k] + 1, sig[k]);
//    	}
//    	res += value.substring(sig[sig.length - 1] + 1, arr[len - 1]);
//    	for(Integer k = 0; k < proc.length; k ++) {
//    		res += proc[k];
//    	}
//    	if(sig == 0) {
//    		for(Integer i = 1; i < len; i ++) {
//        		sub1 += arr[i];
//        	}
//    		res = sub1;
//    	} else {
//    		for(Integer i = 0; i < sig; i ++) {
//        		sub1 += arr[i];
//        	}
//        	for(Integer i = sig + 1; i < len; i ++) {
//        		sub2 += arr[i];
//        	}
//        	res = sub1.concat(sub2);
//    	}
    	
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
