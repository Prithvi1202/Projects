
import java.util.*;
 
class RandomNumbersAndOddEven {
  public static void main(String[] args) {
    int i, c;
    int odd = 0, even = 0;
 
    for (c = 1; c <= 10; c++) {
    	  i = (int)((Math.random() * 99999)+10000);
    	if(i%2 == 0)
    		even++;
    	else 
    		odd++;
    	  System.out.println(i);  
    }
    System.out.println("Odd Numbers are: " + odd + " Even Numbers are: " + even);
  }
}