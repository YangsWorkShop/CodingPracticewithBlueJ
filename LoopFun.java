 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if (number == null) {    
              return null;
          }
          int fac = 1;
          while(number > 1) {
              fac *= number--;
          }
          return fac;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          if (phrase == null) {
              return null;
          }
          //Convert the phrase to uppercase and separate it into an array with spaces
          String[] s = phrase.toUpperCase().split(" ");
          String resultStr = ""; 
          for (String str : s) {
              //concat the first char of String
              resultStr = resultStr.concat(String.valueOf(str.charAt(0)));
          }
          return resultStr;
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
          if (word == null) {
            return null;
          }
          int x = 0;
          //store result String
          String s = "";
          for (int i = 0; i < word.length(); ++i) {
              //get current char
              char c = word.charAt(i);
              //if c=x,y,z then c equal the case 
              switch (c) {
                  case 'x':
                     s = s.concat("a");
                     break;
                  case 'y':
                     s = s.concat("b");
                     break;
                  case 'z':
                     s = s.concat("c");
                     break;
                  default:
                     //c not equal x,y,z normal + 3
                     x = c + 3;
                     s = s.concat(String.valueOf((char)x));
                     break;
              } 
          }
          return s; 
      }
}
