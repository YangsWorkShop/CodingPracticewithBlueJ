 

public class LoopFun
{
    
    public static void main(String[] args){
        
        LoopFun object = new LoopFun();
        Integer method1 = object.factorial(5);
        System.out.println(method1);
        String method2 = object.acronym("Ruby on Rails");
        System.out.println(method2);
        String method3 = object.encrypt("");
        System.out.println(method3);
    }

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer fact = 1;
          for(int i = 1; i <= number; i++){
              fact = fact * i;
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
          StringBuilder acronym = new StringBuilder();

          String[] WordsArray = phrase.split(" ");
          for(String word : WordsArray) {
              acronym.append(word.substring(0,1) );
              
          }
          
          String output = acronym.toString();
          
          return output.toUpperCase();
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
          //StringBuilder new_string = new StringBuilder();
          String s = "";
          int len = word.length();
          int shift = 3;
          for(int x = 0; x < len; x++){
              char c = (char)(word.charAt(x) + shift);
              if (c > 'z')
                s += (char)(word.charAt(x) - (26-shift));
              else
                s += (char)(word.charAt(x) + shift);
            }
          return s;
          
      
      }
}
