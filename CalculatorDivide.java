import java.util.Scanner;

public class CalculatorDivide {
  public static void main(String[] args) 
  {
    
    Scanner scanner = new Scanner(System.in);
    
    //System.out.print("Input the first number: ");
    int a = scanner.nextInt();

    //System.out.print("Input the second number: ")
    int b = scanner.nextInt();
    
    
    int result = a / b;
    
  
    System.out.println( + result);
    
    scanner.close();
  }
}
