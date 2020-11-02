 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if (number == null) return null;
          int result = 1;
          while (number > 1) {
              result *= number--;
            }
          return result;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          if (phrase == null) return null;
          String[] temp = phrase.toUpperCase().split(" ");
          String result = "";
          for (String elem : temp) {
              result = result.concat(String.valueOf(elem.charAt(0)));
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
          if (word == null) return null;
          int start = 0;
          String result = "";
          for (int i = 0; i < word.length(); ++i) {
              char key = word.charAt(i);
              switch(key){
                  case 'x':
                    result = result.concat("a");
                    break;
                  case 'y':
                    result = result.concat("b");
                    break;
                  case 'z':
                    result = result.concat("c");
                    break;
                  default:
                    start = key + 3;
                    result = result.concat(String.valueOf((char)start));
                    break;
                }
      }
      return result;
    }
}
