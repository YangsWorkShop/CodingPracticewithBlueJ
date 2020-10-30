 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if (number == 0) return 0;
          if (number == 1) return 1;
          return number * factorial(number - 1);
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          for (int i = 0; i < phrase.length(); i++) {
              if (i == 0 || phrase.charAt(i - 1) == ' ') {
                  result += Character.toUpperCase(phrase.charAt(i));
              }
          }
          return result;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] arr = word.toCharArray();
          for(int i = 0; i < arr.length; i++){
              arr[i] = (char)(((int)(arr[i]-'a') + 3) % 26 + 'a');
          }

          return new String(arr);
      }
}
