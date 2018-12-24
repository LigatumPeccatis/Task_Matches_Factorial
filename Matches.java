import java.util.Scanner;

/**
 *
 * @author Illustratus
 */
public class Matches {

public static void main(String[] args) {
      Matches Tasks=new Matches();
      Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter squares count");
      int square = scanner.nextInt();
      Tasks.Matches(square);

            
      
}

void Matches(int squares){
    Double answer= 2*(squares+ Math.sqrt(squares));
    Integer res=answer.intValue();
    int result =(Math.sqrt(squares) % 1==0) ? res: res+1;
    System.out.println(result);
}



}