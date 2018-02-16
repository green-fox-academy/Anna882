import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a distance in kilometers as an integer!");
        int kilometers = scanner.nextInt();
        double aMile = 0.621371192;
        double miles;

        miles = kilometers * aMile;
        System.out.println("The distance is " + miles + " miles.");

    }
}