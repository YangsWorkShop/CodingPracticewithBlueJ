
/**
 * Write a description of class StringUtilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringUtilities
{
    // get the middle character of the input word
    public static Character getMiddleCharacter(String word)
    {
        return word.charAt(word.length()/2);
    }
    
    //remove the specific char from the input string
    public static String removeCharacter(String word, char charToRemove)
    {
        String result = "";
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) != charToRemove){
                result += word.charAt(i);
            }
        }
        return result;
    }
    
    //split a string into words and return the last word
    public static String getLastWord(String value)
    {
        String[] result = value.split(" ");
        return result[result.length - 1];
    }
    
    //concate two string and return it
    public static String concatenate(String baseValue, String valueToBeAdded)
    {
        return baseValue + valueToBeAdded;
    }
    
    //return the reversed input string
    public static String reverse(String valueToBeReversed)
    {
        char[] tempArray = valueToBeReversed.toCharArray();
        String result = "";
        for(int i=tempArray.length - 1; i>=0; i--){
           result += tempArray[i];
        }
        return result;
    }

    // return the input value
    public static String returnInput(String input)
    {
        return input;
    }
}
