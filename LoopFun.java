 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer fact = 1;
          for(Integer i = number; i > 0; i --) {
              fact *= i;
          }
          return fact;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] res = phrase.split("\\s+");
          String r = "";
          for(Integer i = 0; i < res.length; i ++) {
              Character t = res[i].charAt(0);
              r += Character.toUpperCase(t);
          }
          
          return r;
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
    	  char[] temp = word.toCharArray();
    	  String res = "";
    	  for(int i = 0; i < temp.length; i ++) {
    		  if((((int)temp[i] <= 87) && ((int)temp[i] >= 65))) {
    			  temp[i] = (char)((int)temp[i] + 3);
    		  } else if((((int)temp[i] > 87) && ((int)temp[i] <= 90))) {
    			  temp[i] = (char)((int)temp[i] - 23);
    		  } else if((((int)temp[i] <= 119) && ((int)temp[i] >= 97))) {
    			  temp[i] = (char)((int)temp[i] + 3);
    		  } else if((((int)temp[i] > 119) && ((int)temp[i] <= 122))) {
    			  temp[i] = (char)((int)temp[i] - 23);
    		  }
    			  
    	  }
    	  for(Integer i = 0; i < temp.length; i ++) {
    		  res += temp[i];
    	  }
          return res;
      }
}
