
import java.util.*;

public class StringUtilities {
    
    public static void main(String[] args){
        StringUtilities object = new StringUtilities();
        String method1 = object.returnInput("Hello Manav");
        System.out.println(method1);
        String method2 = object.concatenate("Fan","tastic");
        System.out.println(method2);
        String method3 = object.reverse("hello");
        System.out.println(method3);
        Character method4 = object.getMiddleCharacter("Even");
        System.out.println(method4);
        String method5 = object.removeCharacter("Mahnav",'h');
        System.out.println(method5);
        String method6 = object.getLastWord("Hi I am Manav Ahlawat");
        System.out.println(method6);
        
    }
    
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
        String add = baseValue + valueToBeAdded;
        return add;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        char[] char_array = valueToBeReversed.toCharArray();
        int i = 0;
        int j = char_array.length - 1;
        while(i < j){
            char temp = char_array[i];
            char_array[i] = char_array[j];
            char_array[j] = temp;
            i++;
            j--;
        }
        String output = String.valueOf(char_array);
        return (output);
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char[] char_array = word.toCharArray();
        char ans = char_array[char_array.length/2];
        return ans;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder builder = new StringBuilder();
        for(int i =0;i<value.length();i++){
            if(value.charAt(i) != charToRemove){
                builder.append(value.charAt(i));
            }
        }
       return builder.toString(); 
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //String test =  "This is a sentence";
        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        return lastWord;
    }
}
