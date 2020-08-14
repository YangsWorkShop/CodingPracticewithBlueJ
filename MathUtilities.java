 

public class MathUtilities{
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      // Initialize the sum with 0
      int sum =0;
      
      //  add the basevalue with valuetoadd and to the sum
      sum = baseValue +  valueToAdd;
      
      //return sum
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      //initialize sum with datatype double 
      double sum=0;
      
      // add the two numbers and store it into sum
      sum = baseValue + valueToAdd;
      
      //return sum
      return sum;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      //initialize half with  datatype double
      double half=0;
      
      //half is number divided by 2
      half =number/2;
      
      //return half
      return half;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      //  if the number modulus by 2 results into a remaiinder to be 0,  then it is a 
      //even number(return false)
      // otherwise it is an odd number(return true).
      if (number%2 == 0)
          return false;
      return true;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      // Initialize the number
      int res=0;
      
      // result is number multiply by itself
      res= number*number;
      
      //return res
      return res;
  }

}
