/* Sergio,Galindo
 * Lab 02
 * COSC 1436 1:00
 */
import javax.swing.JOptionPane;
public class MyCalculatorJOptionPane{
  public static void main(String[] args){
    int x;
    int y;
    int addition;
    int difference;
    int product;
    double qoutient;
    int remainder;
    double power;
    String inputString;
    
    inputString =
    JOptionPane.showInputDialog("Enter a number for variable X.");
    
    x = Integer.parseInt(inputString);
    
    inputString =
    JOptionPane.showInputDialog("Enter a number for variable Y.");
    
    y = Integer.parseInt(inputString);
    
    addition = x + y;
    
    JOptionPane.showMessageDialog(null, "The sum of " + x + " and " + y + " is " + addition);
    
    difference = x - y;
    
    JOptionPane.showMessageDialog(null, " The difference of " + x + " and " + y + " is " + difference);
    
    product = x * y;
    
    JOptionPane.showMessageDialog(null, " The product of " + x + " and " + y + " is " + product);
    
    qoutient = (double) x / y;
    
    JOptionPane.showMessageDialog(null, " The qoutient of " + x + " and " + y + " is " + qoutient); 
    
    remainder = x % y;
    
    JOptionPane.showMessageDialog(null, " The remainder of " + x + " and " + y + " is " + remainder);
    
    power = Math.pow(x,y);
    
    JOptionPane.showMessageDialog(null, " The power of " + x + " and " + y + " is " + power);
    
    System.exit(0);
    
  }  
}    