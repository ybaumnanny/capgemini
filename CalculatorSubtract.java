import java.util.Scanner;

public class CalculatorSubtract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.print("Enter the first number: ");
        int a = input.nextInt();

        //System.out.print("Enter the second number: ");
        int b= input.nextInt();

        int difference = a- b;

        System.out.println("The difference is: " + difference);
    }
}