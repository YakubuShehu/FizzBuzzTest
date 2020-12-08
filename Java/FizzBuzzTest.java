/**
 * > FizzBuzz Test using Java Programming Language 
 * > Author: Yakubu Shehu
 * > https://github.com/YakubuShehu
 * > https://yakubushehu.com
 */

public class FizzBuzzTest {
  
  
  public static void main (String[] args) {
    
    String outputString = "";
    
    for (int i = 1; i < 101; i++) {
      
      if ((i % 3 == 0) && (i % 5 == 0)) {
          outputString += "FizzBuzz ";
      }
      else if (i % 3 == 0) {
          outputString += "Fizz ";
      }
      else if (i % 5 == 0) {
          outputString += "Buzz ";
      }
      else {
          outputString += i + " ";
      }
    }
 
 System.out.println(outputString);
  }
  
}