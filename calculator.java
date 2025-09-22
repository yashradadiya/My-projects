import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalculation = 'y';
        
        System.out.println("=== Basic Calculator ===");
        System.out.println("Supported operations: +, -, *, /");
        
        while (continueCalculation == 'y' || continueCalculation == 'Y') {
            try {
                // Get first number
                System.out.print("\nEnter first number: ");
                double num1 = scanner.nextDouble();
                
                // Get operator
                System.out.print("Enter operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);
                
                // Get second number
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                // Perform calculation
                double result = performCalculation(num1, num2, operator);
                
                // Display result
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
                }
                
            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter valid numbers.");
                scanner.nextLine(); // Clear the scanner buffer
            }
            
            // Ask if user wants to continue
            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            continueCalculation = scanner.next().charAt(0);
        }
        
        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
    
    public static double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /");
                return Double.NaN;
        }
    }
}