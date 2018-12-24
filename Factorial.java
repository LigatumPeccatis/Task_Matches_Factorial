import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Illustratus
 */
public class Factorial {

 
public static void main(String[] args) {
      Factorial Tasks=new Factorial();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter factorial");
      BigInteger factorial = scanner.nextBigInteger();
      Tasks.FindFactorial(factorial);

      
}

void FindFactorial(BigInteger n){
    BigInteger result=BigInteger.valueOf(1);
    int step=0;
    while(true){
        step++;
        result=result.multiply(BigInteger.valueOf(step));
        //System.out.println(result);
       if(result.equals(n) || result.compareTo(n)==1){
            break;
        }
    }
            
    System.out.println((result.compareTo(n)==1)?"Bad factorial" : step);
}

}