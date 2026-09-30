import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Java Console Calculator ===");
        
        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        
        // Input arithmetic operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        double result;
        boolean validOperation = true;
        
        // Switch block to evaluate the operator
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
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Error: Invalid operator entered.");
                validOperation = false;
                result = 0;
                break;
        }
        
        // Display the output if the operation was valid
        if (validOperation) {
            System.out.printf("Result: %.2f %c %.2f = %.2f\n", num1, operator, num2, result);
        }
        sc.close();
    }
}

