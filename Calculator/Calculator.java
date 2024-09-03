import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // Prompt the user to enter an operator (+, -, *, /)
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;

        // Perform the calculation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                // Handle division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;  // Exit the program if division by zero occurs
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                return;  // Exit the program if an invalid operator is entered
        }

        // Display the result of the calculation
        System.out.println("The result is: " + result);
    }
}
