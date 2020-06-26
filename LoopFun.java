 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          if(number <= 1)
          return number;
          else{
           return number*factorial(number-1);
      }
    }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acro="";
          if(phrase.charAt(0)!=' ')
          acro+=phrase.charAt(0);
          boolean check = false;
          for(int i =1; i< phrase.length();i++){
           char x = phrase.charAt(i);
           if(check)
           acro+=x;
           if(x==' ')
           check = true;
           else
           check = false;
            }
          return acro.toUpperCase();
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
          String enc ="";
          int index =0;
              char[] lower  =new char [26];
              char[] upper = new char [26];
              char l='a';
              char u= 'A';
              
              for(int i=0; i<26;i++){
                lower[i]=l;
                upper[i]=u;
                l+=1;
                u+=1;
                }
          for(int i =0; i < word.length(); i++){
            
              char x = word.charAt(i);
              
              
              if(x>='a'&& x<='z'){
              index = x - 'a';
              
              index += 3;
              if(index<26)
              enc+=lower[index];
              else
              enc+=lower[index-26];
              
              
            }
              else{
              index = x  -'A';
              index += 3;
              if(index<26)
              enc+=upper[index];
              else
              enc+=upper[index-26];
            }
            }
          return enc;
      }
}
