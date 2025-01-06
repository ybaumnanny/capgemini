import java.util.Scanner;

public class CalculatorMultiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  System.out.println("Enter the first number:");
        int x = scanner.nextInt();

       // System.out.println("Enter the second number:");
        int y= scanner.nextInt();

        int product = x * y;

        System.out.println( + product);

        scanner.close();
    }
}