import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Illustratus
 */
public class MatchesAndFactorial {

 
public static void main(String[] args) {
      MatchesAndFactorial Tasks=new MatchesAndFactorial();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter task number\n"+
              "Matches - 1 | Factorial - 2");
      int num = scanner.nextInt();
      
      switch(num){
          case 1:
              System.out.println("Enter squares count");
              int square = scanner.nextInt();
              Tasks.Matches(square);
              break;
              
          case 2:
              System.out.println("Enter factorial");
              BigInteger factorial = scanner.nextBigInteger();
              Tasks.Factorial(factorial);
              break;
          
          default:
              System.out.println("Task with that number dosn't exist");
      }
            
      
}

void Matches(int squares){
    Double answer= 2*(squares+ Math.sqrt(squares));
    Integer res=answer.intValue();
    int result =(Math.sqrt(squares) % 1==0) ? res: res+1;
    System.out.println(result);
}

void Factorial(BigInteger n){
    BigInteger result=BigInteger.valueOf(1);
    int step=0;
    while(true){
        step++;
        result=result.multiply(BigInteger.valueOf(step));
        //System.out.println(result);
        if(result.equals(n)){
            break;
        }
    }
            
    System.out.println(step);
}

}