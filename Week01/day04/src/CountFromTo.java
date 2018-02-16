import java.util.Scanner;

public class CountFromTo {
    public static void main (String [] args) {

        // Create a program that asks for two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number:");
        int number1 = scanner.nextInt();
        System.out.println("Please write one more number:");
        int number2 = scanner.nextInt();

        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        if (number1 >= number2) {
            System.out.println("The second number should be bigger, please write an other one");
            number2 = scanner.nextInt();
        }

        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5
        while (number1 < number2) {
                System.out.println(number1);
                number1++;
        }

    }
}
