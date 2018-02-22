import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
        String userInput = startProgramUserInput();
        calculate(userInput);
    }

    public static String startProgramUserInput() {
        System.out.println("Please type in the expression:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static void calculate(String userInput) {
        String[] partsOfUserInput = userInput.split(" ");
        String operation = partsOfUserInput[0];
        double operand1 = Integer.parseInt(partsOfUserInput[1]);
        double operand2 = Integer.parseInt(partsOfUserInput[2]);
        double result = Double.parseDouble(null);
        if (operation.equals("*")) {
            result = operand1 * operand2;
        }   else if (operation.equals("+")) {
            result = operand1 + operand2;
        }   else if (operation.equals("-")) {
            result = operand1 - operand2;
        }   else if (operation.equals("/")) {
            result = operand1 / operand2;
        }   else if (operation.equals("%")) {
            result = operand1 % operand2;
        }   else {
            System.out.println("Wrong operation, try again!");
            main();
        }

        System.out.println(result);
    }
}