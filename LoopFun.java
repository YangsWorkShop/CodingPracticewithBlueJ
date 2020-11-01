
/**
 * Write a description of class LoopFun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopFun
{
    // return the factorial of a number
    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i<=number; i++){
            result *= i;
        }
        return result;
    }
    
    // return the acronym of a string
    public static String acronym(String phrase)
    {
        String[] tempArray = phrase.split(" ");
        String result = "";
        for(int i = 0; i<tempArray.length; i++){
            result += tempArray[i].charAt(0);
        }
        return result.toUpperCase();
    }
    
    // return the encryption of a word. The ascii code of a encrypted character is 3 bigger than the original character.
    public static String encrypt(String word){
        char[] charArray = word.toCharArray();
        String result = "";
        for(int i = 0; i< charArray.length; i++){
            if((int)charArray[i] + 3 > 122){
                result += (char)(96 + ((int)charArray[i] + 3)%122);
            }
            else{
                result += (char)((int)charArray[i] + 3);
            }
        
        }
        return result;
    }
}
