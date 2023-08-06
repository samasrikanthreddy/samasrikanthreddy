index.java
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Available operations: +, -, *, /");
        System.out.println("Enter 'exit' to quit the calculator.");

        while (true) {
            System.out.print("Enter the first number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double num1 = Double.parseDouble(input);

            System.out.print("Enter the operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double result = 0.0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                        continue; // Continue to the next iteration of the loop.
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue; // Continue to the next iteration of the loop.
            }

            System.out.println("Result: " + result);
        }

        System.out.println("Thank you for using the Simple Calculator!");
        scanner.close();
    }
}
