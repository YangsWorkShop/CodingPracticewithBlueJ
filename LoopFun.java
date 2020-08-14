 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          //initialize the fac variable to 1 as 0 wil result into the final value being zero.
          int fac =1;
          
          // iterate from number to 1 by decrementing 
          for(int i =number; i>0; i--){
              
              //update the fac with  each number multiplication
              fac*=i;
            }
            
          // return factorial
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
          // Split the srting with the help of spaces into list.
          String [] phrasechange = phrase.split(" ");
          
          //initialize a new string
          String s = new String();
          
          // iterate through the list 
          for(int i=0; i< phrasechange.length; i++){
              
              //take the value of first index of the each element, convert it into uppercase
              //then add it to the string.
              s += Character.toString(phrasechange[i].charAt(0)).toUpperCase();
              }
              
            //  return the string
            return s;
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
          char shift = 3;
          
          // initialize new string
          String s = "";
          
          //iterate through the word string
          for(int i=0; i<word.length(); i++){
              
              //for each letter in word, add the shift to the character
              char c = (char)((word.charAt(i) + shift));
              
              // if the char falls off the end.
              if (c > 'z')
                    
                    // subtract the shift from 26 and add the character to the string.    
                    s += (char)(word.charAt(i) -(26-shift));
              else
                    //If the character is less than z, then only add the shift.
                    s += (char)(word.charAt(i) + shift);
              
            }
          // return the string  
          return s;
      }
}
