import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number: ");

          int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();


        // Calculate the sum of the two numbers
        int sum = num1 + num2;

        // Display a blank line for separation
        System.out.println();

        // Display the sum of the two numbers
        System.out.println("Sum: " + sum);
    }
}
