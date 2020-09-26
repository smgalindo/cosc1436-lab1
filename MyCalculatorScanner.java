/* Sergio,Galindo
 * Lab 02
 * COSC 1436 1:00
 */
import java.util.Scanner;
public class MyCalculatorScanner
{
  public static void main(String[] args)
  {
    int x;
    int y;
    int addition;
    int subtraction;
    int product;
    double qoutient;
    double remainder;
    double power;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Please enter a number for variable X ");
    x = keyboard.nextInt();
    
    System.out.print("Please enter a number for variable Y ");
    y = keyboard.nextInt();

    addition = x + y;
    subtraction = x - y;
    product = x * y;
    
    qoutient =(double) x / y;
    remainder = x % y;
    power = Math.pow(x,y);
    
    System.out.println("The sum of " + x + " and " + y + " =  " + addition +
                       " The difference of " + x + " and " + y + " =  " + subtraction + 
                       " The product of " + x + " and " + y + " =  " + product +
                       " The quotient of " + x + " and " + y + " = " + qoutient +
                       " The remainder of " + x + " and " + y + " =  " + remainder +
                       " The power of " + x + " and " + y + " =  " + power); 
  }
}
     