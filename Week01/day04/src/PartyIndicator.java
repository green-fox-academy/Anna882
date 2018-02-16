import java.util.Scanner;

public class PartyIndicator {
    public static void main (String[] args) {
        // Write a program that asks for two numbers
        // Thw first number represents the number of girls that comes to a party, the
        // second the boys
        Scanner scanner = new Scanner(System.in);
        int girls = 0;
        System.out.println("Write the number of girls!");
        girls = scanner.nextInt();

        System.out.println("Write the number of boys!");
        int boys = scanner.nextInt();
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people.
        if (girls == 0 ){
            System.out.println("Sausage party");
        }

        // It should print: The party is exellent!
        // If the the number of girls and boys are equal and there are more people coming than 20
        //
        else if (girls == boys && girls + boys > 20 ) {
            System.out.println("The party is excellent!");
        }

        // It should print: Quite cool party!
        // It there are more than 20 people coming but the girl - boy ratio is not 1-1
        //
        else if (girls + boys > 20 && girls != boys) {
            System.out.println("Quite cool party!");
        }

        // It should print: Average party...
        // If there are less people coming than 20
        else if (girls + boys < 20) {
            System.out.println("Average party...");
        }

    }
}
