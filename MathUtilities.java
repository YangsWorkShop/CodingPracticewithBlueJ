 

public class MathUtilities{
    
    public static void main(String[] args){
        MathUtilities object = new MathUtilities();
        Integer method1 = object.add(2, 3);
        System.out.println(method1);
        //MathUtilities instance = new MathUtilities();
        Double method2 = object.add(2.00, 5.00);
        System.out.println(method2);
        Double method3 = object.half(8);
        System.out.println(method3);
        Boolean method4 = object.isOdd(58);
        System.out.println(method4);
        Integer method5 = object.square(8);
        System.out.println(method5);
        
        
    }
    
  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd number
   * @return the sum of the two numbers
   */
  public Integer add(Integer baseValue, Integer valueToAdd){
      Integer sum = baseValue + valueToAdd;
      return sum;
  }

  /**
   * Add two number together
   * @param baseValue first number
   * @param valueToAdd second number
   * @return the sum of the two numbers
   */
  public Double add(Double baseValue, Double valueToAdd){
      Double sum = baseValue + valueToAdd;
      return sum;
  }

  /**
   * Get half the value of the number
   * @param number the number given
   * @return the half of the number in double
   */
  public Double half(Integer number) {
      //double value = (double)number;
      Double half = (number/2.0);
      return half;
  }

  /**
   * Determine if the number is odd
   * @param number the number given
   * @return true if the number is odd, false if it is even
   */
  public Boolean isOdd(Integer number){
      if(number % 2 != 0){
          return true;
        }
      return false;
  }


  /**
   * Multiply the number by itself
   * @param number the number given
   * @return the result of the number multiply by itself
   */
  public Integer square(Integer number) {
      Integer square = number*number;
      return square;
  }

}
