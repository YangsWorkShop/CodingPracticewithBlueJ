
/**
 * Write a description of class MathUtilities here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathUtilities
{

    //return the sum of two int numbers
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
    //return the sum of float numbers
    public static double add(double num1, double num2)
    {
        return num1 + num2;
    }
    
    
    // return the half of a number
    public static double half(double num)
    {
        return num / 2;
    }
    
    // return whether a number is odd. If odd, return true,else return false
    public static boolean isOdd(int num)
    {
        if(num % 2 == 0){
            return false;
        }
        return true;
    }
    
    // return the square of num
    public static int square(int num)
    {
        return num * num;
    }
    
        
}
